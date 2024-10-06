public class LinearSearch {
    public static void main(String[] args) {
        // Define an array of integers
        int[] numbers = {3, 7, 1, 9, 4, 5};
        int target = 9; // The number we want to search for

        // Perform linear search
        int result = linearSearch(numbers, target);

        // Output the result
        if (result == -1) {
            System.out.println("Element " + target + " not found in the array.");
        } else {
            System.out.println("Element " + target + " found at index: " + result);
        }
    }

    // Linear search method
    public static int linearSearch(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i; // Return the index if the element is found
            }
        }
        return -1; // Return -1 if the element is not found
    }
}
