package com.arc.network.datagram;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class ServerDatagramSlide {

    private DatagramSocket socket;

    public ServerDatagramSlide() {
        try {
            socket = new DatagramSocket(12345);
        }
        catch (SocketException e) {
            e.printStackTrace();
        }
    }

    public void waitForPackets(){
        while (true) {
            try {
                byte[] data = new byte[1024];
                DatagramPacket receivePacket = new DatagramPacket(data, data.length);
                socket.receive(receivePacket);
                System.out.println("Packet received.");
                sendPacketToClient(receivePacket);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    private void sendPacketToClient(DatagramPacket receivePacket) throws IOException {
        DatagramPacket sendPacket = new DatagramPacket(
                receivePacket.getData(), receivePacket.getLength(),
                receivePacket.getAddress(), receivePacket.getPort());

        socket.send(sendPacket);
        System.out.println("Packet sent.");
    }
}
