package org.example.proxy;

public class Proxy implements Subject{
    private RealSubject realSubject;

    @Override
    public void request(){
        if(realSubject == null){
            realSubject = new RealSubject();
        }
        System.out.println("Proxy: Logging request. ");
        realSubject.request();
    }
}
