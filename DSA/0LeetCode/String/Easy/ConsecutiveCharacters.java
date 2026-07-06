/*
Easy
1446: Consecutive Characters
06-July-26

Constraints:

1 <= s.length <= 500
s consists of only lowercase English letters.

*/

public class ConsecutiveCharacters {
    public static int maxPower(String s) {
       int max = 1;
       
       int i=0,  j=i+1;
       while (i<s.length()) {
        int count = 1;
         while (j<s.length() && s.charAt(i)==s.charAt(j)) {
            count++;
            j++;
         }
         if(count>max) max=count;
         i=j;
         j=i+1;
       }

       return max;
    }

    public static void main(String[] args) {
        String s = "abcde";    // leetcode - 2 ,   // abbcccddddeeeeedcba - 5

        System.out.println(maxPower(s));
    }
}
