/*
Easy
392: Is Subsequence
03-July-26

Constraints:

0 <= s.length <= 100
0 <= t.length <= 10^4
s and t consist only of lowercase English letters.
 
Follow up: 
Suppose there are lots of incoming s, say s1, s2, ..., sk where k >= 10^9, and you want to check one by one 
to see if t has its subsequence. In this scenario, how would you change your code?

*/

public class IsSubsequence {
    //passes all test cases but in 22ms
    public static boolean isSubsequence2(String s, String t) {
      int sLen = s.length();
      if(sLen==0) return true;

      int j=0;
      for (int i = 0; i < t.length(); i++) {
         if(!t.contains(s.charAt(j)+"")) return false;
         if(j<sLen && s.charAt(j)==t.charAt(i)) { System.out.println("char(j): "+s.charAt(j)+", char(i): "+t.charAt(i)+", i: "+i+", j: "+j); j++;  }
         System.out.println("i: "+i+", j: "+j);
         if (j == sLen) break;
      }
      
    //   if(j==sLen) return true;
    //   else return false;
        return j==sLen;
    }

    //2ms
    public static boolean isSubsequence(String s, String t) {
        int sp = 0;
        int tp = 0;

        while (sp < s.length() && tp < t.length()) {
            if (s.charAt(sp) == t.charAt(tp)) {
                sp++;
            }
            tp++;
        }

        return sp == s.length();
    }

    public static void main(String[] args) {
        String t = "ahbgdc";  //        abcde                  ahbgdc
        String s = "";    // aec-f, axc-f, ace-t        axc-f,  abc-t , ""-t
        
        System.out.println(isSubsequence(s, t));
    }
}
