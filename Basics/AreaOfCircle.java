import java.util.*;
public class AreaOfCircle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of circle: ");
        int r = sc.nextInt();
        float area = 3.14f*r*r;
        System.out.print("Area of circle with "+ r +" is: "+area);
        
    }
}