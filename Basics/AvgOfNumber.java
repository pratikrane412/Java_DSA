import java.util.*;
public class AvgOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of x: ");
        double x = sc.nextDouble();
        System.out.print("Enter the value of y: ");
        double y = sc.nextDouble();
        System.out.print("Enter the value of z: ");
        double z = sc.nextDouble();
        System.out.println("Average of 3 numbers is " + average(x, y, z));
    }

    public static double average(double x, double y, double z){
        return (x + y + z)/3;
    }
}
