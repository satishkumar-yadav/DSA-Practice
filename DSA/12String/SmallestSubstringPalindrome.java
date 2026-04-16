public class SmallestSubstringPalindrome {
    public static void main(String[] args) {
        String s = "malayalam";
        String smallestSub = s;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 3; j < s.length(); j++) {
                String sub = s.substring(i, j);
                if (isPalindrome(sub)) {
                    if (sub.length() < smallestSub.length())
                        smallestSub = sub;
                }
            }
        }
        System.out.println(smallestSub);
    }

    public static boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}
