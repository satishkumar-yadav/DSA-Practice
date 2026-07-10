/*
Easy
917: Reverse Only Letters
10-July-26

Constraints:

1 <= s.length <= 100
s consists of characters with ASCII values in the range [33, 122].
s does not contain '\"' or '\\'.
*/

public class ReverseOnlyLetters {
    public static String reverseOnlyLetters(String s) {
       if(s.length()== 0 || s.length()==1) return s; 
       StringBuilder sb = new StringBuilder(s);
       String letters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
       int i = 0;  int j = sb.length()-1;
       while (i<j) {
        // if(!letters.contains(sb.charAt(i)+"")) i++;  // Using String.contains() on every iteration is costly (O(n) per check)
        // if (!letters.contains(sb.charAt(j) + "")) j--;
         if (!Character.isLetter(sb.charAt(i)));  // Character.isLetter() correctly handles all alphabetic characters.
         else if (!Character.isLetter(sb.charAt(i)));   
         else{
               char temp = sb.charAt(i);   
               sb.setCharAt(i, sb.charAt(j));  
               sb.setCharAt(j, temp);
               i++;
               j--;
         }
       }

       return sb.toString();
    }

    public static void main(String[] args) {
        // String s = "ab-cd";  // dc-ba
         String s = "a-bC-dEf-ghIj";  // j-Ih-gfE-dCba
        // String s = "Test1ng-Leet=code-Q!";  // Qedo1ct-eeLg=ntse-T!

        System.out.println(reverseOnlyLetters(s));
    }
}