package OOPS;

public class Abstraction {
    public static void main(String[] args) {
        Mustang myhorse = new Mustang();
    }
}

abstract class Animal {
    String color;

    Animal() {
        System.out.println("animal constructor called");
    }

    void eat() {
        System.out.println("eats");
    }

    abstract void walk();
}

class Horse extends Animal {

    Horse() {
        System.out.println("horse constrctor called");
    }

    void changeColor() {
        color = "white";
    }

    void walk() {
        System.out.println("walks on four legs");
    }
}

class Mustang extends Horse {
    Mustang() {
        System.out.println("mustang constructor called");
    }
}

class Chicken extends Animal {
    void changeColor() {
        color = "yellow";
    }

    void walk() {
        System.out.println("walks on two legs");
    }
}
