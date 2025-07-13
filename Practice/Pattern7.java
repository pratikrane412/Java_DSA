package Practice;

public class Pattern7 {
    public static void main(String[] args) {
        int n = 5;
        // outer loop
        for (int i = 1; i <= 5; i++) {
            // inner loop
            for (int j = 1; j <= n; j++) {
                System.out.print(j);   
            }
            n--;
            System.out.println();
        }
    }
}
