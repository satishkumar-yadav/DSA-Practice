/*
07-July-26
*/

public class RecursiveDigitSum115 {

    public static int superDg(String sum) {
       if(sum.length() == 1) return Integer .parseInt(sum);
 
       int sm = 0;
       for (int i = 0; i < sum.length(); i++) sm += sum.charAt(i) - '0';    // or Character.getNumericValue(sum.charAt(i))

      return superDg(sm+"");        
    }

    //not suitable to larer value
    public static int superDigit2(String n, int k) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < k; i++) sb.append(n);
        
        return superDg(sb.toString());
    }

    //////////////////////////////////////
    
    //recursive helper function to reduce a number to its super digit
    public static int getSuperDigit(long num){
        if(num<10) return (int) num;

        long sum =0;
        while(num>0){
            sum += num % 10;
            num /= 10;
        }

        return getSuperDigit(sum);
    }

      public static int superDigit(String n, int k) {
        long initialSum=0;
        for (int i = 0; i < n.length(); i++)  initialSum += n.charAt(i) - '0'; //sum calculation
        
        initialSum *= k;  //multiply by k to simulate concatenation digit sum

        return getSuperDigit(initialSum);
        
      }   

    public static void main(String[] args) {
        String n = "9875";
        int k = 4;

        System.out.println(superDigit(n, k));
    }
    
}