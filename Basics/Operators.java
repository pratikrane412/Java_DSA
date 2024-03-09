import java.util.*;

public class Operators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the temperature: ");
        int temp = sc.nextInt();

        if(temp>30){
            System.out.println("Its hotter outside!");
        }
        else if(temp>=25 && temp<=30){
            System.out.println("Its mild outside!");
        }
        else{
            System.out.println("Its cold outside!");
        }
    }
    
}
