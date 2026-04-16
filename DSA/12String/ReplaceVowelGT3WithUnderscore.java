public class ReplaceVowelGT3WithUnderscore {
    
    static void vowelCount(String s) {
        char ch[] = s.toCharArray();
        String vowels = "aeiouAEIOU";
        int vowelCount = 0;
        String vowelIndex = "";
       
        for (int i = 0; i < s.length(); i++) {
           if (vowels.indexOf(s.charAt(i)) != -1) { vowelCount ++ ;  vowelIndex += i; } }
         // System.out.print(vowelCount + " : "+vowelIndex+" , ");

        for (int i = 0; i < vowelIndex.length(); i++) {
            if(vowelCount > 3){ int in = (vowelIndex.charAt(i) - '0')   ;  ch[in] = '_'; } }   // replace vowel with $ if vowel count > 3

        // for (int i = 0; i < ch.length; i++) 
        //     System.out.print(ch[i]);

        System.out.println(new String(ch));
    }

    public static void main(String[] args) {
        String s1 = "java";   // o/p : java     , vowel = 2 < 3
        String s2 = "java is easy"; // o/p : j_v_ _s __sy  ,  vowel = 5>3
        String s3 = "javadeve"; // o/p : j_v_d_v_ , vowel = 4>3

        // replace vowel with $ if vowel count > 3
        vowelCount(s1);
        vowelCount(s2);
        vowelCount(s3);
    }
} 
 