package org.example;

import org.example.composite.CompositePatternDemo;
import org.example.prototype.PrototypePatternDemo;
import org.example.proxy.ProxyPatternDemo;
import org.example.strategy.StrategyPatternDemo;

public class Main {
    public static void main(String[] args) {

        PrototypePatternDemo.main(args);
        CompositePatternDemo.main(args);
        ProxyPatternDemo.main(args);
        StrategyPatternDemo.main(args);
    }
}