public class MyMain {

    // Reverses an array
    public static int[] reverse(int[] arr) {
        //Reverse counter
        int j = 0;
        //Resulting array to change values
        int[] result = new int[arr.length];
        //Reverse array by looping through and utilizing both counters
        for(int i = arr.length-1; i >= 0; i--) {
            result[j] = arr[i];
            j++;
        }
        return result;
    }

    // Finds the second largest number in an array
    public static int secondLargest(int[] arr) {
        //Init max and secondMax
        int max = arr[0];
        int secondMax = arr[0];
        //Find max
        for(int i = 0; i < arr.length-1; i++) {
            max = (max < arr[i + 1]) ? arr[i + 1] : max;
        }
        //Find second max by looping through like we found max but making sure it's not max
        for(int i = 0; i < arr.length-1; i++) {
            secondMax = (arr[0] == max) ? arr[i + 1] : secondMax;
            if(secondMax < arr[i + 1] && arr[i + 1] != max) {secondMax = arr[i + 1];}
        }
        return secondMax;
    }

    // Checks to see if an array contains a geometric series
    public static boolean isGeometric(int[] arr) {
        //Init two dummy vars
        double one = 0;
        double two = 0;
        //Just divide lol
        for(int i = 0; i < arr.length-2; i++) {
            one = (double) arr[i + 2] / (double) arr[i + 1];
            two = (double) arr[i + 1] / (double) arr[i];
            //break
            if(one != two) {return false;}
        }
        return true;
    }

    public static void main(String[] args) {
        //Testing purposes
        int[] array = {1, 2, 4, 8, 16, 33};
        for(int i = 0; i < array.length; i++) {System.out.print(array[i] + " ");}
        System.out.println(secondLargest(array));
        System.out.println(isGeometric(array));
    }
}
