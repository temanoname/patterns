package org.example.proxy;

public class RealSubject implements Subject{
    @Override
    public void request(){
        System.out.println("RealSubject: Handling request. ");
    }
}
