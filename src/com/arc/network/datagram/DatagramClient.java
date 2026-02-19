package com.arc.network.datagram;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class DatagramClient {
    private DatagramSocket socket;
    private Scanner scanner;

    public DatagramClient() {
        try {
            socket = new DatagramSocket(12346); // Bind to client port
            System.out.println("Client started on port 12346");
        } catch (SocketException e) {
            throw new RuntimeException("Error starting client", e);
        }
        scanner = new Scanner(System.in);
    }

    public void waitForPackets() {
        // Start a thread to send messages to the server
        new Thread(() -> {
            while (true) {
                try {
                    System.out.print("CLIENT: ");
                    String message = scanner.nextLine();
                    byte[] data = message.getBytes();
                    DatagramPacket sendPacket = new DatagramPacket(data, data.length,
                            InetAddress.getLocalHost(), 12345); // Server port
                    socket.send(sendPacket);
                } catch (IOException e) {
                    System.err.println("Error sending packet: " + e.getMessage());
                }
            }
        }).start();

        // Main thread to receive messages from server
        while (true) {
            try {
                byte[] data = new byte[1024];
                DatagramPacket receivePacket = new DatagramPacket(data, data.length);
                socket.receive(receivePacket);

                String received = new String(receivePacket.getData(), 0, receivePacket.getLength()).trim();
                System.out.println("SERVER: " + received);
            } catch (IOException e) {
                System.err.println("Error receiving packet: " + e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        new DatagramClient().waitForPackets();
    }
}
