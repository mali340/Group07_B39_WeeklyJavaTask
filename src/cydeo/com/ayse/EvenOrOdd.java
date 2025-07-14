package cydeo.com.ayse;

import java.util.Scanner;

public class EvenOrOdd {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);  // Step 1
            System.out.print("Enter a number: ");      // Step 2
            int number = scanner.nextInt();            // Step 3

            // Step 4: Check if the number is even or odd
            if (number % 2 == 0) {
                System.out.println(number + " is even.");  // Step 5
            } else {
                System.out.println(number + " is odd.");   // Step 6
            }

            scanner.close();  // Step 7
        }

    }
