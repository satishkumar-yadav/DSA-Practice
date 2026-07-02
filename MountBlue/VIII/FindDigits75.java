/*
01-July-26
*/

public class FindDigits75 {
    public static int findDigits(int n) {
        int count =0;
        int m = n;
        while (m>0) {
            int digit = m%10;
            if( digit != 0 && n%(digit)==0) count++;
            m /=10;
        }

        return count;
    }

    public static void main(String[] args) {
        int n=124;

        System.out.println(findDigits(n));
    }
    
}