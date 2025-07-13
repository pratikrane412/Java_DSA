public class Pattern12 {

    public static void invertednumPyramid(int n) {

        for (int i = 1; i<=n; i++) {
            for (int j = 1; j<=n-i+1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void numPyramid(int n) {

        for (int i = 1; i<=n; i++) {
            for (int j = 1; j<=i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        invertednumPyramid(5);
        numPyramid(5);
    }
}