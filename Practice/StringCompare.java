package Practice;

public class StringCompare {
    public static void main(String[] args) {
        String str1 = "Tony";
        String str2 = "Tony";
        String str3 = new String("Tony");

        if (str1 == str2) {
            System.out.println("strings are equals");
        } else {
            System.out.println("string not equals");
        }

        if (str1 == str3) {
            System.out.println("strings are equals");
        } else {
            System.out.println("strings are not equals");
        }

        if (str1.equals(str3)) {
            System.out.println("strings are equals");
        } else {
            System.out.println("strings not equals");
        }
    }
}
