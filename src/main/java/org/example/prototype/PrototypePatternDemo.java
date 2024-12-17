package org.example.prototype;

import java.awt.*;

public class PrototypePatternDemo {
    public static void main(String[] args) {

        ConcretePrototype1 prototype1 = new ConcretePrototype1("Prototype 1 Instance");
        ConcretePrototype2 prototype2 = new ConcretePrototype2(42);


        ConcretePrototype1 clone1 = (ConcretePrototype1) prototype1.clone();
        ConcretePrototype2 clone2 = (ConcretePrototype2) prototype2.clone();

        System.out.println(" ");
        System.out.println("1 PATTERN: PROTOTYPE");
        System.out.println("----------------------------------------");
        System.out.println("Original 1: " + prototype1);
        System.out.println("Clone 1: " + clone1);

        System.out.println(" ");
        System.out.println("Original 2: " + prototype2);
        System.out.println("Clone 2: " + clone2);
    }
}
