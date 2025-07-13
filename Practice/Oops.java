package Practice;

public class Oops {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "pratik rane";
        System.out.println(s1.name);
        s1.rollno = 12;
        System.out.println(s1.rollno);
        s1.username = "pratikrane0412";
        System.out.println(s1.username);
        s1.setPassword("pratik123");
        System.out.println(s1.getPassword());
    }
}

class Student {
    String name;
    int rollno;
    String username;
    private String password;

    String getPassword() {
        return this.password;
    }

    void setPassword(String newPassword) {
        this.password = newPassword;
    }
}
