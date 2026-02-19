package com.arc.network.datagram;

public class ClientDatagramSlideTest {
    public static void main(String[] args) {
        ClientDatagramSlide application = new ClientDatagramSlide();
        application.waitForPackets();
    }
}
