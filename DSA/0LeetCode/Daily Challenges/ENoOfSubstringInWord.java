/*
Easy
1967: Number of Strings that appear as Substrings in a word
29-Jun-26

*/


public class ENoOfSubstringInWord {
    public static int numOfStrings(String[] patterns, String word) {
        int count = 0;
        for (String str : patterns) {
            if(word.contains(str)) count++;
        }

        return count;
    }

    public static void main(String[] args) {
        String word = "aaaaaaaaabbbbbbb";
        String []patterns = {"a","b","c"};            // { "a", "abc", "bc", "d"};

        System.out.println(numOfStrings(patterns, word));
    }
}
