
public class Pattern9 {
    public static void main(String[] args) {
        int n = 4;
        int m = 4;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
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
