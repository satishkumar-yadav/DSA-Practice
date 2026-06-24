/*

205: Isomorphic Strings
24-Jun-26

Constraints:

1 <= s.length <= 5 * 10^4
t.length == s.length
s and t consist of any valid ascii character.

*/

import java.util.HashMap;

public class IsomorphicString {
    public static boolean isIsomorphic2(String s, String t) {  //O(n^2) - containsValue
        if (s.length() != t.length())
            return false;

       HashMap<Character,Character> hm = new HashMap<>();

       for (int i = 0; i < s.length(); i++) {
           if(hm.containsKey(s.charAt(i))) {
               char ch = hm.get(s.charAt(i));
               if(ch != t.charAt(i)) return false;
           }
           else {
               if(hm.containsValue(t.charAt(i))) return false;  //O(n)
               hm.put(s.charAt(i), t.charAt(i));
           }
       }

       return true;
    }

    public static boolean isIsomorphic(String s, String t) { //O(n)
        if (s.length() != t.length())
            return false;

        HashMap<Character, Character> map1 = new HashMap<>();
        HashMap<Character, Character> map2 = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
             char c1 = s.charAt(i);
             char c2 = t.charAt(i);

            if (map1.containsKey(c1)) {
                if (map1.get(c1) != c2)
                    return false;
            } else {
                if (map2.containsKey(c2))
                    return false; 
                map1.put(c1, c2);
                map2.put(c2, c1);
            }
        }

        return true;
    }

    public static void main(String[] args) {
       // String s = "egg";
       // String t = "add"; //true
       // String s = "f11";
       // String t = "b23"; // false
       // String s = "paper";
       // String t = "title"; // true
        String s = "badc";
        String t = "baba"; // false

        System.out.println(isIsomorphic(s, t));
    }
}
