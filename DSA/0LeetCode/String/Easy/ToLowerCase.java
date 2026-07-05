/*
Easy
709: To Lower Case
05-July-26

Constraints:

1 <= s.length <= 100
s consists of printable ASCII characters.

*/

public class ToLowerCase {
     // using built-in method
    public static String toLowerCase(String s) {
      return s.toLowerCase();
    }

    // Manual ASCII conversion
    public static String toLowerCase2(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (65 <= ch && ch <= 90) result += (char) (ch + 32);
            else result += ch;
        }
        return result;
    }

    public static void main(String[] args) {
       // String s = "Hello" ;  //hello
       // String s = "here" ;  // here
        String s = "LOVELY" ;  // lovely

        System.out.println(toLowerCase(s));
    }
}
