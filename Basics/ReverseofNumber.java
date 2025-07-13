import java.util.*;

public class ReverseofNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to reverse: ");
        int n = sc.nextInt();
        int rev = 0;

        // while (n > 0) {
        // int lastDigit = n % 10;
        // System.out.print(lastDigit);
        // n = n / 10;
        // }
        // System.out.println();

        while (n > 0) {
            int lastDigit = n % 10;
            rev = (rev * 10) + lastDigit;
            n = n / 10;
        }
        System.out.println(rev);
    }
}



