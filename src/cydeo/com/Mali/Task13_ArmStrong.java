package cydeo.com.Mali;

import java.util.Scanner;

public class Task13_ArmStrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your number :");
        int num = scanner.nextInt();
        if(isArmstrong(num)){
            System.out.println(num+" is armstrong number ");
        }else{
            System.out.println(num+ " is not armstrong number ");
        }
        scanner.close();

    }

    private static boolean isArmstrong(int num) {
        int originalNum = num;
        int count = 0;
        int n = String.valueOf(num).length();

        while (num > 0) {
            int digit = num % 10;
            count += Math.pow(digit, n);
            num /= 10;
        }

        return count == originalNum;
    }

}


