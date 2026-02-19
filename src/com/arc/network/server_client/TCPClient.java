package com.arc.network.server_client;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class TCPClient {
    private Socket socket;
    private int port = 12345;

    private ObjectOutputStream output;
    private ObjectInputStream input;
    private String message;
    private Scanner scanner;

    public TCPClient(int port) throws IOException, ClassNotFoundException {
        this.port = port;
        listen();
    }

    public void listen() throws IOException, ClassNotFoundException{
        socket = new Socket(InetAddress.getLocalHost(), 12345);

        output = new ObjectOutputStream(socket.getOutputStream());
        input = new ObjectInputStream(socket.getInputStream());
        System.out.println("in");
        scanner = new Scanner(System.in);

        message = "CLIENT TEST";
        output.writeObject(message);
        output.flush();

        message = (String) input.readObject();
        System.out.println(message);

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        message = scanner.nextLine();
                        output.writeObject(message);
                        output.flush();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }).start();

        while (!message.equals("exit")){
            message = (String) input.readObject();
            System.out.println(message);
        }

    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        TCPClient tcpClient = new TCPClient(12345);
    }
}
