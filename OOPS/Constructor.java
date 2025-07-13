package OOPS;

public class Constructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("pratik");
        Student s3 = new Student(123);
    }
}

class Student {
    String name;
    int rollno;

    Student() {
        System.out.println("constructor is called...");
    }

    Student(String name){
        this.name = name;
    }

    Student(int roll){
        this.rollno = roll;
    }
}