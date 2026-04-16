public class RemoveVowelChar {
    
    static void removeVowel(String s) {
       // String vowels = "aeiouAEIOU";
        char c[] = s.toCharArray();
        
        for (int i = 0; i < c.length; i++) {
            if(c[i]=='a' || c[i]=='e' || c[i] == 'i' || c[i] == 'o' || c[i] == 'u' || c[i] == 'A' || c[i] == 'E' || c[i] == 'I' || c[i] == 'O' || c[i] == 'U' ) c[i] = '\u0000';
 
            if(c[i] != '\u0000')
            System.out.print(c[i]);
        }
        
        // m-II
        // for (int i = 0; i < s.length(); i++) {
        //     char ch = s.charAt(i);
        //     // If the vowel string DOES NOT contain the current char, print it
        //     if (vowels.indexOf(ch) == -1) {
        //         System.out.print(ch);
        //     }
        // }

    }

    public static void main(String[] args) {
        String s = "India";   // o/p : nd

        // remove Vowel
        removeVowel(s);
    }

}

