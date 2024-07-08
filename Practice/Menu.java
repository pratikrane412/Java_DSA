package Practice;

public class Menu {

    public static int item(String arr[], String key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String arr[] = { "vadpav", "samosa", "idli", "dosa", "chole" };
        String key = "idli";

        int index = item(arr, key);
        if (index == -1) {
            System.out.println("not found");
        } else {
            System.out.println("key is at index: " + index);
        }

    }
}
