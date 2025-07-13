package Revision;

import java.util.*;

public class Test5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        int factorial = 1;

        System.out.print("Enter a positive integer: ");
        number = sc.nextInt();

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        System.out.println("Factorial: " + factorial);
    }
}
