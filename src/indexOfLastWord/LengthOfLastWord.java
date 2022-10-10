package indexOfLastWord;

public class LengthOfLastWord {

    public int LengthOfLastWorld(String s) {
        int len = s.length();
        int count = 0;
        while (len > 0) {
            if (s.charAt(--len) != ' ') {
                count++;
            } else if (count > 0) {
                return count;
            }
        }
        return count;}

        public static void main(String[]args){
            LengthOfLastWord obj = new LengthOfLastWord();
            System.out.println("This is an apple --> " + obj.LengthOfLastWorld("This is an apple"));

        }
    }


