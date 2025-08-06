package cydeo.com.ivan;

public class Task09_Array_FindMinimum {

    public static int minimumNumber(int[] arr) {

        int minNum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minNum) {
                minNum = arr[i];
            }
        }
        return minNum;
    }

    public static void main(String[] args) {

        int[] exampleArray = {12,55,76,-13,44};
        System.out.println("minimumNumber(exampleArray) = " + minimumNumber(exampleArray));
    }
}

//    Array -- Find Minimum
//Write a method that can find the minimum number from an int Array