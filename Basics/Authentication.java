import java.util.*;
public class Authentication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the emailid: ");
        String email = sc.nextLine();
        System.out.print("Enter the password: ");
        String password = sc.nextLine();

        if (email == "pratikrane0412@gmail.com" && password == "Pratik@123") {
            System.out.println("Welcome");
        }
        else{
            System.out.println("Invalid");
        }
    }
    
}
