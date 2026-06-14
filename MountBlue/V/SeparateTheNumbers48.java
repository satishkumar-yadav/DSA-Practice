
public class SeparateTheNumbers48 {
    public static void separateNumbers(String s) {
        //if starts with '0' or length=1, can't be beautiful
        if(s.charAt(0)=='0' || s.length()==1) {
            System.out.println("NO");
            return;
        }

        int n=s.length();
        boolean isValidSequenceFound= false;
        long startingNumber = -1;

        //first number can be of at most half of entire string length
        for (int i = 1; i <= n/2; i++) {
            String firstNumStr = s.substring(0,i);
            long firstNum = Long.parseLong(firstNumStr);

            //Building test sequence dynamically using sb
            StringBuilder dynamicSequence = new StringBuilder();
            long nextExpectedNum = firstNum;

            //appending sequential numbers until matched or exceed original length
            while (dynamicSequence.length()<n) {
                dynamicSequence.append(nextExpectedNum);
                nextExpectedNum++;
            }

            if(dynamicSequence.toString().equals(s)){
                isValidSequenceFound = true;
                startingNumber = firstNum;
                break;  // smallest valid first number is always found first
            }
        }

        if(isValidSequenceFound) System.out.println("YES "+startingNumber);
        else System.out.println("NO");
    }
    
    public static void main(String[] args) {
        String s = "99100";

       separateNumbers(s);
    }
}