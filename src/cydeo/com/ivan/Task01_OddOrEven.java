package cydeo.com.ivan;

public class Task01_OddOrEven {

    public static void main(String[] args) {

    oddOrEvenNumber(9);   // calling method to check

    }

    public static void oddOrEvenNumber(int x){

        if (x <= 0) {
            System.err.println(x + " number is invalid");
        } else if (x % 2 == 0) {
            System.out.println(x + " number is even");
        } else {
            System.out.println(x + " number is odd");
        }
    }


}
