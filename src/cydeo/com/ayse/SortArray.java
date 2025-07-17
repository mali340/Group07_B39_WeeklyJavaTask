package cydeo.com.ayse;

public class SortArray {
    // Method to sort the array in ascending order
    public static int[] sortAscending(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap elements
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        return arr;
    }

    // Main method to test the sorting
    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7};
        arr = sortAscending(arr);

        // Print the sorted array
        System.out.print("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        // Output: Sorted array: 7 8 9 10
    }
}
