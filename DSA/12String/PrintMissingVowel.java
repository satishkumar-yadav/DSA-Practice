public class PrintMissingVowel {
    public static void main(String[] args) {
        String s = "I LOVE my India";
        String vowel = "aeiouAEIOU";
        for (int i = 0; i < vowel.length(); i++) {
            char c = vowel.charAt(i);
            if(! s.contains(c+""))
                System.out.print(c);
        }
    }
}
