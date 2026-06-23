/*
Easy
1189: Maximum Number Of Balloons
22-Jun-26

Given a string text, you want to use the characters of text to form as many instances of the word "balloon" as possible.

You can use each character in text at most once. Return the maximum number of instances that can be formed.

Constraints:
1 <= text.length <= 10^4
text consists of lower case English letters only.

Note: This question is the same as 2287: Rearrange Characters to Make Target String.

*/

public class EMaximumNumberOfBalloons {
    public static int maxNumberOfBalloons(String text) {
           int[] counts = new int[26];//only dealing with lowercase english letters

           //counting freq of all char in text
           for (int i = 0; i < text.length(); i++) counts[text.charAt(i)-'a']++;
           
           //Retrieving counts for individual parts of balloon
           int bCount = counts['b'-'a'];
           int aCount = counts['a'-'a'];
           int lCount = counts['l'-'a']/2; //needs 2 'l's per word
           int oCount = counts['o'-'a']/2;
           int nCount = counts['n'-'a'];

           //finding limiting factor(the minimum count)
           int maxBalloons = bCount;
           maxBalloons = Math.min(maxBalloons, aCount);
           maxBalloons = Math.min(maxBalloons, lCount);
           maxBalloons = Math.min(maxBalloons, oCount);
           maxBalloons = Math.min(maxBalloons, nCount);

           return maxBalloons;

    }

    public static void main(String[] args) {
        String text = "loonbalxballpoon"; //2
       // String text = "nlaebolko"; //1
       // String text = "leetcode"; //0

        System.out.println(maxNumberOfBalloons(text));
    }
}
