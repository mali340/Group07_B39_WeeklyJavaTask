package cydeo.com.ayse;

public class Armstrong {

    public static boolean isArmstrong(int num){

        int sum = 0;

        int originalNunber = num;

        int digits = String.valueOf(num).length();


        while(num != 0){

            int digit = num % 10;

            sum += Math.pow(digit, digits);

            num /= 10;
        }

        return sum == originalNunber;

    }

    public static void main(String[] args) {

        int num = 157, num2 = 153;

        System.out.println(isArmstrong(num));

        System.out.println(isArmstrong(num2));




    }
}
