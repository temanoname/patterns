package org.example.strategy;

public class ConcreteStrategyB implements Strategy{
    @Override
    public void execute() {
        System.out.println("Executing strategy B");
    }
}
