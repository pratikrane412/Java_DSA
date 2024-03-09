public class FunctionOver {

    // function to calculate sum of 2 nums
    public static int sum(int a, int b){
        return a + b;
    }

    //funtion to calculate sum of 3 num
    // public static int sum(int a, int b, int c){
    //     return a + b + c;
    // }

    // function to calculate sum of 2 float
    public static float sum(float a, float b){
        return a + b;
    }    
    public static void main(String[] args) {
        System.out.println(sum(3, 5));
        System.out.println(sum(3.2f, 4.8f));
    }
}
