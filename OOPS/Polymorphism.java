package OOPS;

public class Polymorphism {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.sum(12, 4));
        System.out.println(calc.sum((float) 1.5, (float) 2.5));
        System.out.println(calc.sum(2, 3, 5));
        Calc calc2 = new Calc();
        System.out.println(calc2.sum(1, 2));
        Deer deer  = new Deer();
        deer.eats();
    }
}

//function overloading
class Calculator {
    int sum(int a, int b) {
        return a + b;
    }

    float sum(float a, float b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }
}

// we cannot create a class of same name 
class Calc {
    int sum(int a, int b){
        return a + b;
    }
}

class Animal{
    void eats(){
        System.out.println("eats anything");
    }
}

class Deer extends Animal{
    void eats(){
        System.out.println("eats grass");
    }
}