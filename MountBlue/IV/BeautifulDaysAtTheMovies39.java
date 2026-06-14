

public class BeautifulDaysAtTheMovies39 {
    public static int beautifulDays(int i, int j, int k) {
       int count =0; 
       
       for (int m = i; m <= j; m++) {
           int num =m;
           int rev = 0;
           while(num>0){
              rev = rev*10 + (num%10);
              num /=10;
           }

           if(Math.abs((m-rev) % k) ==0){
               count++;
               //System.out.println("i: "+m+", rev: "+rev);
           } 
       }

       return count;
    }

    public static void main(String[] args) {
        // int i=20,  j=23, k=6;
        int i = 13, j = 45, k = 3;
        System.out.println(beautifulDays(i, j, k));

        //System.out.println(18%6);
    }
}
