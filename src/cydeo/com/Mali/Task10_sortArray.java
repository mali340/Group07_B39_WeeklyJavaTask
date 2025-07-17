package cydeo.com.Mali;

public class Task10_sortArray {
    public static int[] sort(int[] arr) {

        for (int i = 0; i < arr.length-1; i++) {

            for (int j = 0; j < arr.length-1 - i; j++) {
                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }

        }

        return arr;
    }


    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7};
        arr = sort(arr);


        for (int eachnum : arr) {
            System.out.print(eachnum + " ");
        }
    }
}


