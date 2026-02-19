package com.arc.network.datagram;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class ClientDatagramSlide {

    private DatagramSocket socket;
    private Scanner scanner;

    public ClientDatagramSlide() {
        try {
            scanner = new Scanner(System.in);
            socket = new DatagramSocket();
            new Thread(new Runnable() {
                @Override
                public void run() {
                    while (true) {
                        try {
                            String message = scanner.nextLine();
                            byte[] data = message.getBytes();
                            DatagramPacket sendPacket = new DatagramPacket(
                                    data, data.length,
                                    InetAddress.getByName("localhost"), 12345);
                            socket.send(sendPacket);
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }

                    }
                }
            }).start();
        }
        catch (SocketException e) {
            e.printStackTrace();
        }
    }

    public void waitForPackets() {
        while (true) {
            try {
                byte[] data = new byte[1024];
                DatagramPacket receivePacket = new DatagramPacket(data, data.length);
                socket.receive(receivePacket);
                System.out.println("Packet received. " + new String(receivePacket.getData()).trim());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
