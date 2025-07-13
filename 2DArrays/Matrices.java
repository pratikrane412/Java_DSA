import java.util.*;

public class Matrices {
    public static void main(String[] args) {
        int matrix[][] = new int[3][3];

        Scanner sc = new Scanner(System.in);

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = sc.nextInt();
            }
        }

        // output
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");                     
            }
            System.out.println();
        }
    }
}