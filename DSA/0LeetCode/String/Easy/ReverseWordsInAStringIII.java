/*
557 : Reverse words in a String III

*/

public class ReverseWordsInAStringIII {
    public static String reverseWords(String s) {
        String res = "";
        int n = s.length(), i = 0, j = 0;

        while (j < n) {
            while (i < n && s.charAt(i) == ' ') { // for reaching to word, skipping space
                res += " ";
                i++;
            } //
            j = i;//
            while (j < n && s.charAt(j) != ' ')
                j++; // reaching to end of word
            int k = j - 1;
            while (k >= i) {
                res += s.charAt(k);
                k--;
            }
            // res += " ";
            // j++;
            i = j;
        }
        return res;
    }

    public static void main(String[] args) {
       String s = "    Let's     take LeetCode   contest     ";
       // String s = "Mr Ding";

       System.out.println(reverseWords(s));
    }
}
