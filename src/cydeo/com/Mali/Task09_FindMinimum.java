package cydeo.com.Mali;

public class Task09_FindMinimum {
    public static int findMin(int[] arr) {

        int min = arr[0];


        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {

                min = arr[i];
            }
        }

        return min;
    }



    public static void main(String[] args) {
        int[] numbers = {35, 5, 9, 12, 7};
        int minimum = findMin(numbers);
        System.out.println("Minimum number is: " + minimum);
    }
}

