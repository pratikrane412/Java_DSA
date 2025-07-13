package Practice;

public class LargestSmallest {

    public static int largestNumber(int arr[][]) {
        int largest = Integer.MIN_VALUE;

        for (int rows = 0; rows < arr.length; rows++) {
            for (int cols = 0; cols < arr[rows].length; cols++) {
                largest = Math.max(largest, arr[rows][cols]);
            }
        }
        return largest;
    }

    public static int smallestNumber(int arr[][]) {
        int smallest = Integer.MAX_VALUE;

        for (int rows = 0; rows < arr.length; rows++) {
            for (int cols = 0; cols < arr[rows].length; cols++) {
                smallest = Math.min(smallest, arr[rows][cols]);
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 } };

        System.out.println(largestNumber(arr));
        System.out.println(smallestNumber(arr));

    }
}
