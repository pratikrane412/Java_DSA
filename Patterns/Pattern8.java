public class Pattern8 {
    public static void main(String[] args) {
        int row = 4;
        int col = 5;
        
        for(int i = 1; i<=row; i++){
            for(int j = 1; j<=col ; j++){
                if((i==1 || i==col) || (j==1 || j==col) || (i==row))
                    System.out.print("*");
                
                else
                    System.out.print(" ");
            }
                System.out.println();
            }
        }
    }

