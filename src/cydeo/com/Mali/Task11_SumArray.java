package cydeo.com.Mali;

public class Task11_SumArray {

        public static int[] sumZero(int N) {
            int[] result = new int[N];
            int index = 0;


            for (int i = 1; i <= N / 2; i++) {
                result[index++] = -i;
                result[index++] = i;
            }


            if (N % 2 != 0) {
                result[index] = 0;
            }

            return result;
        }


        public static void main(String[] args) {
            int N = 6;
            int[] output = sumZero(N);


            for (int num : output) {
                System.out.print(num + " ");
            }
        }
    }

