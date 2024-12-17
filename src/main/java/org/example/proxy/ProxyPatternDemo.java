package org.example.proxy;

public class ProxyPatternDemo {
    public static void main(String[] args) {
        Subject proxy = new Proxy();
        System.out.println(" ");
        System.out.println("3 PATTERN: PROXY");
        System.out.println("-----------------------");
        proxy.request();
    }
}
