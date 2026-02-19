package com.arc.network.server_client;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    ServerSocket server;
    Socket socket;
    ObjectInputStream input;
    ObjectOutputStream output;
    Scanner scanner;

    Server(){
        try {
            server = new ServerSocket(12345,100);
            scanner = new Scanner(System.in);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void run(){
        try {
            System.out.println("Waiting for connection...");
            socket = server.accept();
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
                System.out.println("CLIENT -> " + (String) input.readObject());
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
        Server server1 = new Server();
        server1.run();
    }
}