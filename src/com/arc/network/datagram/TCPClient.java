package com.arc.network.datagram;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class TCPClient {
    private Socket connection;
    private Scanner scanner;
    private ObjectOutputStream output;
    private ObjectInputStream input;
    private String message;

    private void runClient() throws IOException, ClassNotFoundException {
        connection = new Socket(InetAddress.getByName("localhost"), 12345);

        output = new ObjectOutputStream(connection.getOutputStream());
        input = new ObjectInputStream(connection.getInputStream());
        scanner = new Scanner(System.in);

        System.out.println("Write \"exit\" to exit ");
        new Thread(() -> {
            while (true) {
                try {
                    output.writeObject(scanner.nextLine());
                    output.flush();

                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();

        do {
            message = (String) input.readObject();
            System.out.println(message);
        } while (!message.equals("exit"));

        output.close();
        input.close();
        connection.close();

    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        TCPClient tcpClient = new TCPClient();
        tcpClient.runClient();
    }
}
