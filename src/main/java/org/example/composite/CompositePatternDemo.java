package org.example.composite;

public class CompositePatternDemo {
    public static void main(String[] args) {
        Component leaf1 = new Leaf();
        Component leaf2 = new Leaf();
        Composite composite = new Composite();

        composite.add(leaf1);
        composite.add(leaf2);

        System.out.println(" ");
        System.out.println("2 PATTERN: COMPOSITE");
        System.out.println("---------------------------");
        composite.operation(); // Выводит "Leaf operation" дважды
    }
}
