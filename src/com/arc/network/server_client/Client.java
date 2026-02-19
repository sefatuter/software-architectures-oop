package com.arc.network.server_client;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    Socket socket;
    ObjectOutputStream output;
    ObjectInputStream input;
    Scanner scanner;

    Client(){
        scanner = new Scanner(System.in);
    }

    public void run(){
        try {
            System.out.println("Waiting for connection...");
            socket = new Socket(InetAddress.getLocalHost(),12345);
            System.out.println("Connected!");
            input = new ObjectInputStream(socket.getInputStream());
            System.out.println("in");
            output = new ObjectOutputStream(socket.getOutputStream());
            System.out.println("Debug");
            System.out.println("Streams acquired.");
            new Thread(() -> {
                try {
                    output.writeObject(scanner.next());
                    output.flush();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }).start();
            while(true){
                System.out.println("SERVER -> " + (String) input.readObject());
            }

        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }finally{
            try {
                socket.close();
                input.close();
                output.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        Client client = new Client();
        client.run();
    }
}
