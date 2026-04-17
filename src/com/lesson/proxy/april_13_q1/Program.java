package com.lesson.proxy.april_13_q1;

public class Program {
    public static void main(String[] args) {
        Client client = new Client();
        System.out.println("Client: Executing the code with a real subject");

        RealSubject realSubject = new RealSubject();

        client.ClientCode(realSubject);

        Proxy proxy = new Proxy(realSubject);

        client.ClientCode(proxy);
    }
}
