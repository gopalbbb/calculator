package revarse_number;

public class RevarseNumber {
        public static void main(String[] args) {

            int num = -214748368;
            int maxValue = Integer.MAX_VALUE;
            int minValue = Integer.MIN_VALUE;
            int rev = 0;
            while (num != 0) //for start loop


            {
                rev = rev * 10 + num % 10;
                num = num / 10;}

            if (rev > maxValue || rev <minValue) {
                System.out.println(0);
            } else {

                System.out.println("The reverse number is" + rev);

            }
        }
    }


