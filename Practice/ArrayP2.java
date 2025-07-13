package Practice;

public class ArrayP2 {

    public static int findMenu(String menu[], String key) {
        for (int i = 0; i < menu.length; i++) {
            if (menu[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String menu[] = { "idli", "dosa", "vadapav", "samosa", "upma" };
        String key = "samosa";

        int index = findMenu(menu, key);
        if (index == -1) {
            System.out.println("menu not found");
        } else {
            System.out.println("menu found at index: " + index);
        }
    }
}
