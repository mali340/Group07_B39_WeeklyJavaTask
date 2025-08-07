package cydeo.com.milan;

import java.util.Scanner;

public class Task01_OddOrEven {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number:");
        int num = scanner.nextInt();

        if (num <= 0) {
            System.err.println(num + " number is invalid");
        } else if (num % 2 == 0) {
            System.out.println(num + " number is even");
        } else {
            System.out.println(num + " number is odd");
        }

    }

}

