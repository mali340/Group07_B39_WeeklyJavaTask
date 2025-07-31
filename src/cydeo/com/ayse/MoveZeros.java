package cydeo.com.ayse;

import java.util.Arrays;

public class MoveZeros {
    public static int[] moveZerosToEnd(int[] ary) {
        int insertPos = 0;

        // Step 1: Move non-zero elements to the front
        for (int num : ary) {
            if (num != 0) {
                ary[insertPos++] = num;
            }
        }

        // Step 2: Fill the remaining positions with zeros
        while (insertPos < ary.length) {
            ary[insertPos++] = 0;
        }

        return ary;
    }

    public static void main(String[] args) {
        int[] input = {1, 0, 2, 0, 3, 0, 4, 0};
        System.out.println("Arrays.toString(moveZerosToEnd(input)) = " + Arrays.toString(moveZerosToEnd(input)));
    }

}
