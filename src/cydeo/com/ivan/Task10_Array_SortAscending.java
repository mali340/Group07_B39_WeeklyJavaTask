package cydeo.com.ivan;

import java.sql.Array;
import java.util.Arrays;
import java.util.ArrayList.*;
public class Task10_Array_SortAscending {

    public static void main(String[] args) {

        int[] arr = {10, 9, 8, 7};

        int[] sortArr = new int[arr.length];
        int x = 0;

        for (int i = arr.length - 1; i >= 0; i++) {
            for(int j = 0; j < arr.length; j++){

            }

        }
        //System.out.println(Arrays.toString(sortArr));





        class ArraySorter {

            public static int[] sort(int[] arr) {
                int n = arr.length;

                // Bubble sort algorithm
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

            // Example usage
            public static void main(String[] args) {
                int[] arr = {10, 9, 8, 7};
                arr = sort(arr);

                // Print the sorted array
                for (int num : arr) {
                    System.out.print(num + " ");
                }
            }
        }


    }
}
//    10.    Array -- Sort Ascending
//    Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
//    Ex:
//    int[] arr = {10, 9, 8, 7};
//    arr = Sort(arr);         ==>{ 7, 8, 9, 10};

