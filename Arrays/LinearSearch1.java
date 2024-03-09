package Arrays;

public class LinearSearch1 {

    public static int linearSearch(String menu[], String item){

        for(int i = 0; i < menu.length; i++){
            if(menu[i] == item){
                return i;
            }
        }
        return -1 ;
    }
    public static void main(String[] args) {
        String menu[] = {"idli", "samosa", "vadapav", "dosa", "sandwich"};
        String item = "sandwich";

        int index = linearSearch(menu, item);

        if(index == -1){
            System.out.println("not found");
        }
        else{
            System.out.println("the item is at index: " + index);
        }

    }
    
}
