/*
409

*/

public class LongestPalindrome {
    public static int longestPalindrome(String s) {
        // ASCII size array to store freq of char
        int[] charCount = new int[129];

        for (int i = 0; i < s.length(); i++)
            charCount[s.charAt(i)]++;

        int length = 0;
        boolean hasOdd = false;

        for (int count : charCount) {
            // add max even portion of this char freq
            length += (count / 2) * 2;
            // if there is remainder, it means an odd freq exists
            if (count % 2 == 1)
                hasOdd = true;
        }

        // if there was atleast one odd char freq,
        // we can place exactly one of those unique char in middle
        return hasOdd ? length + 1 : length;
    }

    public static void main(String[] args) {
      String  s = "abccccdd";

      System.out.println(longestPalindrome(s));
    }
}
