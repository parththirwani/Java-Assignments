public class ArraySum {
    // Method to find the sum of all elements in the array
    public int findSum(int[] arr) {
        int sum = 0;
        // Loop through the array to sum up the elements
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
}