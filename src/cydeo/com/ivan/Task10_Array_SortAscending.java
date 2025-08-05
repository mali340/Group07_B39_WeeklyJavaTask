package cydeo.com.ivan;


public class Task10_Array_SortAscending {

    public static int[] sort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return arr;  // for null or single-element arrays


        }
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {99, 88, 77, 66, 55};
        arr = sort(arr);    // calling method


        for (int each : arr) {
            System.out.print(each + " ");   // printing through the loop
        }
    }
}


//    10.    Array -- Sort Ascending
//    Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
//    Ex:
//    int[] arr = {10, 9, 8, 7};
//    arr = Sort(arr);         ==>{ 7, 8, 9, 10};

