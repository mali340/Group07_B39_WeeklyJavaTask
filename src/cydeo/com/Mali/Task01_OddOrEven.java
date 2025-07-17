package cydeo.com.Mali;

import java.util.Scanner;

public class Task01_OddOrEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number:");
        int num=scanner.nextInt();
        if (num%2==0){
            System.out.println("number is even = " + num);
        }else{
            System.out.println("number is odd  = " + num);
        }
        scanner.close();
    }
}
