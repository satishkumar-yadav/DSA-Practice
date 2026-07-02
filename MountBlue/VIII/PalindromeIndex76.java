/*
01-July-26
*/

public class PalindromeIndex76 {

    public static boolean isPalindrome(String s, int left, int right){
        while (left<right) {
            if(s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }

    public static int palindromeIndex(String s) {
       int i=0, j=s.length()-1;
       while (i<j) {
        if(s.charAt(i) != s.charAt(j)){
            //remove charAt(i) and check remaining string
            if(isPalindrome(s, i+1, j)) return i;
            
            //remove charAt(j) and check rest string
            if(isPalindrome(s, i, j-1)) return j;

            //if neither creates palindrome, it's impossible
            return -1;
        }
        i++;
        j--;
       }

       return -1;   //already palindrome
    }    

    //fails for some case
    public static int palindromeIndex2(String s) {
        int i=0, j = s.length()-1;
        while (i<s.length()-1 && j>0) {
            char st = s.charAt(i);
            char en = s.charAt(j);
            if(st != en){
                if(st == s.charAt(j-1)) return j;
                else if(en == s.charAt(i+1)) return i;
            }
            i++;
            j--;
        }

        return -1;
    }

    public static void main(String[] args) {
        // String s = "bcbc";  //3
        // String s = "aaab";     // 3
        // String s = "baa";  // 0
         String s = "aaa";  //-1

        System.out.println(palindromeIndex(s));
    }
    
}