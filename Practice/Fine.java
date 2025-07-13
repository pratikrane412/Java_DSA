package Practice;

public class Fine {
    public static int charges(int arr[], int date, int x){
        int fine = 0;
        
        for(int i = 0; i<arr.length; i++){
            if(arr[i] % 2 == 0){
                return fine;
            }
            else{
                fine = fine + x;
            }
        }
        return fine;
    }
    
    public static void main(String[] args) {
        int arr[] = {5,2,3,7};
        int date = 12;
        int x = 1200;
        
        System.out.println(charges(arr, date, x));
    }
}

