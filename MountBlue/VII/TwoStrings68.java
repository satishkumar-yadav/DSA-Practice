/*
30-Jun-26
*/

import java.util.HashSet;
import java.util.Set;

public class TwoStrings68 {
    public static String twoStrings(String s1, String s2) {
       Set<Character> s1Chars = new HashSet<>();
       for (int i = 0; i < s1.length(); i++)  s1Chars.add(s1.charAt(i));

       //checking if char from s2 exists in the set
       for (int j = 0; j < s2.length(); j++) if (s1Chars.contains(s2.charAt(j))) return "YES";
       
       return "NO";
    }

    public static void main(String[] args) {
        String s1= "hello";
        String s2 = "world";

        System.out.println(twoStrings(s1, s2));
    }
    
}