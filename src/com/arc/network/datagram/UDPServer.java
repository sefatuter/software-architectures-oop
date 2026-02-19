package com.arc.network.datagram;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class UDPServer {
    private DatagramSocket socket;
    private Scanner scanner;
    private String message;
    private String received;

    public void connect() throws IOException {

        socket = new DatagramSocket(12345);
        scanner = new Scanner(System.in);

        System.out.println("Type your message (type 'exit' to quit):");
        new Thread(() -> {
            try {
                while (true) {
                    message = scanner.nextLine();
                    if ("exit".equalsIgnoreCase(message)) {
                        socket.close();
                        break;
                    }

                    byte[] sendData = message.getBytes();
                    DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, InetAddress.getByName("192.168.1.101"), 12346);
                    socket.send(sendPacket);
                }
            } catch (IOException e) {
                System.err.println("Error sending message: " + e.getMessage());
            } finally {
                socket.close();
                System.out.println("Server closed.");
            }
        }).start();

        while (true) {
            try {
                byte[] receiveData = new byte[1024];
                DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
                socket.receive(receivePacket);

                received = new String(receivePacket.getData(), 0, receivePacket.getLength()).trim();
                System.out.println("CLIENT: " + received);

                if ("exit".equalsIgnoreCase(received)) {
                    System.out.println("Client exited. Closing server...");
                    socket.close();
                    break;
                }
            } catch (IOException e) {
                System.err.println("Error receiving message: " + e.getMessage());
            }
        }

        socket.close();
        scanner.close();
    }

    public static void main(String[] args) throws IOException {
        UDPServer udpServer = new UDPServer();
        udpServer.connect();
    }
}
