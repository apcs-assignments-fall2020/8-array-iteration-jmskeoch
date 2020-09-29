public class MyMain {

    // Reverses an array
    public static int[] reverse(int[] arr) {
        int j = 0;
        int[] result = new int[arr.length];
        for(int i = arr.length-1; i > 0; i--) {
            result[j] = arr[i];
            j++;
        }
        return result;
    }

    // Finds the second largest number in an array
    public static int secondLargest(int[] arr) {
        // REPLACE WITH YOUR CODE HERE
        return -1;
    }

    // Checks to see if an array contains a geometric series
    public static boolean isGeometric(int[] arr) {
        // REPLACE WITH YOUR CODE HERE
        return false;
    }


    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 6, 9, 8};
        int[] newArr = reverse(arr);
        for(int i = 0; i < arr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }
}
