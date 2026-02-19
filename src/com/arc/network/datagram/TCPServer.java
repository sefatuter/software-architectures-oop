package com.arc.network.datagram;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TCPServer {
    private ServerSocket serverSocket;
    private Socket connection;
    private Scanner scanner;

    private ObjectOutputStream output;
    private ObjectInputStream input;
    private String message;

    public void runServer() throws IOException, ClassNotFoundException {

        serverSocket = new ServerSocket(12345);
        connection = serverSocket.accept();

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

    public static void main(String[] args) throws IOException {
        TCPServer tcpServer = new TCPServer();

        try {
            tcpServer.runServer();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
