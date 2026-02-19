package com.arc.network.datagram;

public class ServerDatagramSlideTest {
    public static void main(String[] args) {
        ServerDatagramSlide application = new ServerDatagramSlide();
        application.waitForPackets();
    }
}
