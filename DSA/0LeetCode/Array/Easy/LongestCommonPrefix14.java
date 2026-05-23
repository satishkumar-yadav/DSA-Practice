/*
14. Longest Common Prefix

Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

Example 1:
Input: strs = ["flower","flow","flight"]
Output: "fl"

Example 2:
Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
 
Constraints:

1 <= strs.length <= 200
0 <= strs[i].length <= 200
strs[i] consists of only lowercase English letters if it is non-empty.

*/

public class LongestCommonPrefix14 {
    public static String longestCommonPrefix(String[] strs) {
      String s = strs[0];

       for(int i=1; i<strs.length; i++){
        int j=0;
        while(j<s.length() && j<strs[i].length() && s.charAt(j)==strs[i].charAt(j)) {
            j++;
            if(j>=strs[i].length()) break;
        }
        s=s.substring(0, j);
      }
      System.out.println(s.length());
      return s;
    }

    public static void main(String[] args) {
       // String strs[] = {"flower","flow","flight"};
        String strs[] = { "dog", "racecar", "car" };

       System.out.println(longestCommonPrefix(strs));
    }

}
