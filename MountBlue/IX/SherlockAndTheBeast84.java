/*
03-July-26
*/

public class SherlockAndTheBeast84 {
    public static void decentNumber(int n) {
        int fiveCount =n;  // greedy approach: assuming all digits are 5's

        //if no of 5 is not div by 3, strip away 5s (which will be replaced by 3s) until remaining no of 5s is div by 3
        while (fiveCount>=0) {
            if(fiveCount % 3 ==0) break;
            fiveCount -= 5; 
        }

        //if reached below 0, no valid configuration exists
        if(fiveCount<0) System.out.println(-1);
        else{
            StringBuilder sb = new StringBuilder();

            //appending 5's (fiveCount amount)
            for (int i = 0; i < fiveCount; i++) sb.append('5');

            //appending 3's (remaining digits)
            for (int i = 0; i < (n-fiveCount); i++) sb.append('3');
                
            System.out.println(sb.toString());   
        }

    }

    public static void main(String[] args) {
        int n = 11;  //  1       3       5          11             100000
                    // -1      555    33333   55555533333

        decentNumber(n);
    }
    
}