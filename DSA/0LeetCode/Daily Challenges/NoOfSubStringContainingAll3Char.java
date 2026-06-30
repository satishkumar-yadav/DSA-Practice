/*
  Medium
  1358: Number of Substrings containing all three characters
  30-Jun-26

  Constraints:
    3 <= s.length <= 5 x 10^4
    s only consists of a, b or c characters.

*/

//TLE
public class NoOfSubStringContainingAll3Char {
    public static int numberOfSubstrings1(String s) {
        int count = 0;
        
        for (int i = 0; i<s.length()-2; i++) {
            for (int j = 3; j<=s.length(); j++) {
                if(j-i<3) continue;
                String sub = s.substring(i, j);
                if(sub.contains("a") && sub.contains("b") && sub.contains("c")) count++;
            }
        }
        
        return count;
    }

    public static int numberOfSubstrings(String s) {
        int[] freq = new int[3];

        int left = 0, res = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            freq[s.charAt(i) - 'a']++;

            while (freq[0] > 0 && freq[1] > 0 && freq[2] > 0) {
                res += n - i;
                freq[s.charAt(left) - 'a']--;
                left++;
            }
        }

        return res;
    }

    public static int numberOfSubstrings2(String s) {
        int res = 0;
        int[] p = {-1, -1, -1};

        for( int i = 0;i<s.length();i++)
        {
            p[(s.charAt(i) & 31) - 1] = i;
            res += Math.min(p[0], Math.min(p[1], p[2])) + 1;
        }

        return res;

    }   

    public static void main(String[] args) {
        //String s= "abcabc";  //10   - "abc", "abca", "abcab", "abcabc", "bca", "bcab", "bcabc", "cab", "cabc", "abc"
        // String s= "aaacb";  //3
         String s= "abc";  //1

        System.out.println(numberOfSubstrings(s));

    }
}
