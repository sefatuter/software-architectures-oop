package com.arc.network.datagram;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class ClientSlide {
    private ObjectOutputStream output;
    private ObjectInputStream input;
    private String message = "";
    private String chatServer;
    private Socket client;

    private Scanner scanner;

    public ClientSlide() {
        scanner = new Scanner(System.in);
    }

    public void runClient(){
        try {
            client = new Socket(InetAddress.getByName("localhost"), 12345);
            System.out.println("Connected to " + client.getInetAddress().getHostAddress());

            output = new ObjectOutputStream(client.getOutputStream());
            output.flush();

            input = new ObjectInputStream(client.getInputStream());
            System.out.println("Got I/O streams");

            new Thread(new Runnable() {
                @Override
                public void run() {
                    while(true) {
                        try {
                            String serverMsg = scanner.nextLine();
                            sendData(serverMsg);
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
            }).start();

            do {
                try {
                    message = ( String ) input.readObject();
                    System.out.println(message);
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            } while (!message.equals("exit"));

            output.close();
            input.close();
            client.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void sendData(String message) throws IOException {
        output.writeObject("CLIENT>>> " + message);
        output.flush();
        System.out.println("CLIENT>>> " + message);
    }

}
