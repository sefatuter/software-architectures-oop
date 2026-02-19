package com.arc.network.datagram;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.util.Scanner;

public class DatagramServer {
    private DatagramSocket socket;
    private Scanner scanner;

    public DatagramServer() {
        try {
            socket = new DatagramSocket(12345); // Bind to port 12345
            System.out.println("Server started on port 12345");
        } catch (SocketException e) {
            throw new RuntimeException("Error starting server", e);
        }
        scanner = new Scanner(System.in);
    }

    public void waitForPackets() {
        // Start a thread to send messages to the client
        new Thread(() -> {
            while (true) {
                try {
                    System.out.print("SERVER: ");
                    String message = scanner.nextLine();
                    // Broadcast to all clients (if needed)
                    byte[] data = message.getBytes();
                    DatagramPacket sendPacket = new DatagramPacket(data, data.length,
                            java.net.InetAddress.getLocalHost(), 12346); // Client port
                    socket.send(sendPacket);
                } catch (IOException e) {
                    System.err.println("Error sending packet: " + e.getMessage());
                }
            }
        }).start();

        // Main thread to receive messages from clients
        while (true) {
            try {
                byte[] data = new byte[1024];
                DatagramPacket receivePacket = new DatagramPacket(data, data.length);
                socket.receive(receivePacket);

                String received = new String(receivePacket.getData(), 0, receivePacket.getLength()).trim();
                System.out.println("CLIENT: " + received);
            } catch (IOException e) {
                System.err.println("Error receiving packet: " + e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        new DatagramServer().waitForPackets();
    }
}
