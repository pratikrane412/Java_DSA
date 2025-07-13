package OOPS;

public class Inheritance {
    public static void main(String[] args) {
        Bird sparrow = new Bird();
        sparrow.eats();
        sparrow.breathe();
        sparrow.fly();
    }
}

// base class
class Animal {
    String color;

    void eats() {
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("breathes");
    }
}

class Mammals extends Animal {
    void walk() {
        System.out.println("walks");
    }
}

class Bird extends Animal {
    void fly() {
        System.out.println("fly");
    }
}

// class Dog extends Mammals {
// String breed;
// }

// derived class
class Fish extends Animal {
    void swin() {
        System.out.println("swims");
    }
}