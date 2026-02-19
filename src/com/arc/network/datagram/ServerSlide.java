package com.arc.network.datagram;

import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerSlide {
    private ObjectOutputStream output;
    private ObjectInputStream input;

    private ServerSocket server;
    private Socket connection;
    private int counter = 1;

    private Scanner scanner;

    public ServerSlide() {
        scanner = new Scanner(System.in);
    }

    public void runServer() {

        try {
            server = new ServerSocket(12345, 100);
            while(true) {
                try {
                    System.out.println("Waiting for connection...\n");
                    connection = server.accept();
                    System.out.println("Connection accepted\n");


                    output = new ObjectOutputStream(connection.getOutputStream());
                    output.flush();

                    input = new ObjectInputStream(connection.getInputStream());

                    System.out.println("Got I/O streams\n");

                    String message = "connection successful";
                    sendData(message);

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
                            message = (String) input.readObject();
                            System.out.println(message);
                        } catch (ClassNotFoundException e) {
                            e.printStackTrace();
                        }
                    } while (!message.equals("exit"));

                    output.close();
                    input.close();
                    connection.close();

                } catch (EOFException eofException) {
                    System.out.println("Server terminated\n");
                } finally {
                    ++counter;
                }
            }
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }

    }
    public void sendData(String message) throws IOException {
        output.writeObject("SERVER>>> " + message);
        output.flush();
        System.out.println("SERVER>>> " + message);
    }
}
