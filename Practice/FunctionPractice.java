package Practice;

import java.util.*;

public class FunctionPractice {

    public static void calculateSum(int num1, int num2) {
        int sum = num1 + num2;
        System.out.println("The sum of number is: " + sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        calculateSum(a, b);
    }
}
