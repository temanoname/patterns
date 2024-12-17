package org.example.strategy;

public class StrategyPatternDemo {
    public static void main(String[] args) {
        System.out.println(" ");
        System.out.println("4 PATTERN: STRATEGY");
        System.out.println("---------------------------");
        Context context = new Context(new ConcreteStrategyA());
        context.executeStrategy();

        context.setStrategy(new ConcreteStrategyB());
        context.executeStrategy();
    }
}
