import java.util.*;

public class Check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of A: ");
        int a = sc.nextInt();
        System.out.print("Enter the value of B: ");
        int b = sc.nextInt();

        if(a==b){
            System.out.println("Both A and B are equal");
        }
        else if(a<=b){
            System.out.println("B is greater than A");
        }
        else{
            System.out.println("A is greater than B");
        }
    }
}
