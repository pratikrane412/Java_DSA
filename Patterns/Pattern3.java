import java.util.*;

public class Pattern3 {

    public static void main(String[] args) {
        System.out.print("Enter the value of n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int i = 1;
        while (i <= n) {

            int j = 1;
            while (j <= n) {
                System.out.print(j);
                j++;
            }
            System.out.println("");
            i++;
        }
    }
}
