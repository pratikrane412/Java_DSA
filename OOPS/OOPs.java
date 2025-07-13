package OOPS;

public class OOPs {
    public static void main(String[] args) {
        Pen p1 = new Pen(); // created a pen called p1
        p1.setColor("blue");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());
        p1.setColor("yellow");
        System.out.println(p1.getColor());

        Student s1 = new Student();
        s1.name = "pratik";
        s1.age = 22;
        System.out.println(s1.calcPercentage(98, 98, 99));
    }
}

class Pen {
    private String color;
    private int tip;

    String getColor() {
        return this.color;
    }

    int getTip() {
        return this.tip;
    }

    void setColor(String newColor) {
        this.color = newColor;
    }

    void setTip(int newTip) {
        this.tip = newTip;
    }
}

class Student {
    String name;
    int age;
    float percentage;

    int calcPercentage(int phy, int chem, int maths) {
        return (phy + chem + maths) / 3;
    }
}
