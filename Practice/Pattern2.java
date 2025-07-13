package Practice;

public class Pattern2 {
    public static void main(String[] args) {
        //outer loop
        for (int i = 1; i <= 4; i++) {
            //inner loop
            for (int j = 1; j <= 4 - i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
