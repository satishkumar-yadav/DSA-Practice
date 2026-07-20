/*
Easy
1047: Remove all Adjacent Duplicates in String
20-July-26

Constraints:
1 <= s.length <= 105
s consists of lowercase English letters.

*/

public class RemoveAllDuplicateInString {
    public static String removeDuplicates(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            int len = sb.length();
            if (len > 0 && sb.charAt(len - 1) == c) {
                sb.deleteCharAt(len - 1); // remove the duplicate
            } else {
                sb.append(c); // add new character
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "abbaca";   // abbaca  - ca
        // String s = "abbaca";   // azxxzy  -  ay

        System.out.println(removeDuplicates(s));
    }
}
