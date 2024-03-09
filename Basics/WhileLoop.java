import java.util.*;
public class WhileLoop {
    public static void main(String[] args) {
        // int counter = 1;

        // while(counter <= 20){
        //     System.out.print(counter+" ");
        //     counter++;
        // }


        // print for 1 to n range
        System.out.print("Enter the value of n: ");
        Scanner sc = new Scanner(System.in);        
        int i = 1;
        int n = sc.nextInt();

        while(i<=n){
            System.out.println(i);
            i++;
        }
    }
    
}
