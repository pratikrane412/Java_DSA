import java.util.*;

public class EvenNum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        if (isEven(num)) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }
    }

    public static boolean isEven(int num) {

        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
