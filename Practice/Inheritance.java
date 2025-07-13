package Practice;

public class Inheritance {
    public static void main(String[] args) {
        Dog doggy = new Dog();
        doggy.color = "brown";
        System.out.println(doggy.color);
        doggy.breed = "german shepard";
        System.out.println(doggy.breed);
        doggy.eat();
        doggy.barks();
        doggy.breathe();
        doggy.walks();
    }
}

class Animal {
    String color;

    void eat() {
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("breathes");
    }
}

class Fish extends Animal {
    int fins;

    void swim() {
        System.out.println("swims");
    }
}

class Bird extends Animal {
    int feathers;

    void fly() {
        System.out.println("fly");
    }
}

class Mammals extends Animal {
    void walks() {
        System.out.println("walks");
    }
}

class Dog extends Mammals {
    String breed;

    void barks() {
        System.out.println("barks");
    }
}