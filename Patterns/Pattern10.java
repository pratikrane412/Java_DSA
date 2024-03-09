public class Pattern10 {

    public static void hollowRectangle(int totrows, int totCols){
        // outer loop
        for(int i = 1; i<=totrows; i++){
            // inner columns
            for(int j = 1; j<=totCols; j++){
                //cell - (i,j)
                if(i == 1 || i == totrows || j == 1 || j == totCols){
                    //boundary cell 
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        hollowRectangle(4, 5);
    }
}
