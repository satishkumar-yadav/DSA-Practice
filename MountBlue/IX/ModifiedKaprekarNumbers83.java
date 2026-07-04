/*
03-July-26
*/

public class ModifiedKaprekarNumbers83 {
    // fails for larger values like 99999, also for odd length square , as here integer is splitted from middle
    public static void kaprekarNumbers2(int p, int q) {
        int count = 0;
        for (int i = p; i <= q; i++) {
            String n = (i*i)+"";
            int len = n.length();
            int a = (len>=2)? Integer.parseInt(n.substring(0, len/2)) : Integer.parseInt(n);
            int b = (len>=2)? Integer.parseInt(n.substring(len/2, len)) : 0;
            if((a+b)==i){
                System.out.print(i+" ");
                count++;
            }
        }

        if(count==0) System.out.println("INVALID RANGE");
    }

    public static void kaprekarNumbers(int p, int q) {
      int count=0;
       
      //using long to prevent overflow during squaring
      for(long i=p; i<=q; i++){
        long sq=i*i;
        String s = String.valueOf(sq);
        int len= s.length();

        //right hand piece must have exactly same number of digits as original number i
        int d = String.valueOf(i).length();

        //calculating where to slice from left side
        int sliceIndex = len-d;

        //splitting into two pieces safely
        String leftStr = s.substring(0, sliceIndex);
        String rightStr = s.substring(sliceIndex);

        int a = leftStr.isEmpty() ? 0 : Integer.parseInt(leftStr);
        int b = rightStr.isEmpty() ? 0 : Integer.parseInt(rightStr);

        if(a+b==i){
            System.out.print(i+" ");
            count++;
        }
      }

      if(count==0) System.out.println("INVALID RANGE");
      else System.out.println();
    }   

    public static void main(String[] args) {
        int p =1;
        int q = 100000;

        kaprekarNumbers(p, q);
    }
    
}