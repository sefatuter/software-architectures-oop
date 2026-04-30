package com.lesson.proxy.april_13_q1;

public class Program {
    public static void main(String[] args) {
        Client client = new Client();

        // 1. Durum: İstemci doğrudan gerçek nesneyle çalışıyor (Güvenli değil, kontrolsüz)
        System.out.println("Client: Executing the code with a real subject");
        RealSubject realSubject = new RealSubject();
        client.ClientCode(realSubject);

        System.out.println("\n----------------------------\n");

        // 2. Durum: İstemci Proxy ile çalışıyor (Güvenli, kontrollü, loglu)
        // Proxy, gerçek nesneyi içeride sarmalıyor (Wrapping)
        Proxy proxy = new Proxy(realSubject);

        System.out.println("Client: Executing the same client code with a proxy");
        client.ClientCode(proxy);
    }
}
