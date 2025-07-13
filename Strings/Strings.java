package Strings;

public class Strings {

    public static void printString(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String firstName = "Pratik";
        String lastName = "Rane";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName.charAt(0));

        printString(fullName);
    }
}
