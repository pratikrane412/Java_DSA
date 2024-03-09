package Arrays;

import java.util.*;

public class ArrayCC {
    public static void main(String[] args) {
        int marks[] = new int[100];

        // int numbers[] = {1, 2, 3};

        // int moreNumbers[] = {4, 5, 6};

        // String fruits[] = {"apple", "mango", "orange"};

        Scanner sc = new Scanner(System.in);

        marks[0] = sc.nextInt(); // physics
        marks[1] = sc.nextInt(); // chemistry
        marks[2] = sc.nextInt(); // maths

        System.out.println("Physics: " + marks[0]);
        System.out.println("Chemistry: " + marks[1]);
        
        marks[2] = marks[2] + 1;
        System.out.println("Maths: " + marks[2]);

        int percentage = (marks[0] + marks[1] + marks[2]) / 3;
        System.out.println("Percentage = " + percentage + " %");

        System.out.println("Length of array: " + marks.length);

    }

}
