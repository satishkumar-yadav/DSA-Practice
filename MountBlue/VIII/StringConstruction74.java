/*
01-July-26
*/

import java.util.HashSet;
import java.util.Set;

public class StringConstruction74 {
     public static int stringConstruction(String s) {
       Set<Character> uniqueChars = new HashSet<>();

       for (int i = 0; i < s.length(); i++) uniqueChars.add(s.charAt(i));

       //size of set represent count of unique chars (total cost)
        return uniqueChars.size();
    }

    public static void main(String[] args) {
        String s = "abab";

        System.out.println(stringConstruction(s));
    }
    
}