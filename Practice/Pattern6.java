package Practice;

public class Pattern6 {
    public static void main(String[] args) {
        int row = 4;
        int cols = 5;

        // outer loop
        for (int i = 1; i <= row; i++) {
            // inner loop
            for (int j = 1; j <= cols; j++) {
                if ((i == 1 || i == cols) || (j == 1 || j == cols) || (i == row)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
