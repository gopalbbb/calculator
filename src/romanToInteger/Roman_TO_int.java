package romanToInteger;

import java.util.Scanner;

public class Roman_TO_int {

        public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter your Roman Number");
            String s = sc.nextLine();
            System.out.println(romanToInt(s));
        }
        static int getInteger(char c)
        {
            switch(c)
            {
                case 'I' : return 1;
                case 'V' : return 5;
                case 'X' : return 10;
                case 'L' : return 50;
                case 'C' : return 100;
                case 'D' : return 500;
                case 'M' : return 1000;
                default : return -1;
            }
        }
        static int romanToInt(String s)
        {
            int n = s.length() , result = 0 , current , next , i = 0;
            while(i < n)
            {
                if(i == n - 1)
                {
                    result += getInteger(s.charAt(i));
                    return result;
                }
                current = getInteger(s.charAt(i));
                next = getInteger(s.charAt(i + 1));
                if(current >= next)
                {
                    result += current;
                    i++;
                }
                else
                {
                    result += next - current;
                    i += 2;
                }
            }
            return result;
        }
    }

