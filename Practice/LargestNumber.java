package Practice;

public class LargestNumber {

    public static int getLargest(int numbers[]) {
        int largest = Integer.MIN_VALUE; // -infinity

        for (int i = 0; i < numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int numbers[] = { 1, 2, 6, 3, 5 };

        System.out.println("largest value is: " + getLargest(numbers));
    }
}
