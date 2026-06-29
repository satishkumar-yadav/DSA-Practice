/*
28-Jun-26

*/

public class AppendAndDelete64 {
    public static String appendAndDelete(String s, String t, int k) {
        int sLen = s.length();
        int tLen = t.length();

        int commonLength = 0;
        int minLength = Math.min(sLen, tLen);

        // finding the length of matching common prefix
        for (int i = 0; i < minLength; i++) {
            if(s.charAt(i)==t.charAt(i)) commonLength++;
            else break;
        }

        //calculating min operation required
        int minOps = (sLen-commonLength) + (tLen-commonLength);

        //Case 1: k is large enough to completely erase s and construct t from scratch
        if(k>= sLen+ tLen) return "Yes";

        //Case 2: k matches minOps exactly, or has an even number of excess steps to waste
        if(k>= minOps && (k-minOps)% 2==0) return "Yes";

        return "No";
    }

    public static void main(String[] args) {
        String s= "abc";   // "abc";   "hackerhappy"      "aba"    "ashley"
        String t = "def";  // "def";   "hackerrank"       "aba"    "ash"
        int k = 6;         //   6;       9;                 7;      2; No

        System.out.println(appendAndDelete(s, t, k));
    }
    
}