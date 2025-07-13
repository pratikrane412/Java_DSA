package Practice;

public class Pattern5 {
    public static void main(String[] args) {
        int n = 4;
        // outer loop
        for (int i = 0; i <= n; i++) {
            // inner loop
            for (int j = 0; j <= n; j++) {
                if (i + j < n) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
