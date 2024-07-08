package Practice;

public class Pattern4 {
    public static void main(String[] args) {
        char ch = 'A';
        int n = 4;
        // outer loop
        for (int i = 1; i <= n; i++) {
            // inner loop
            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
