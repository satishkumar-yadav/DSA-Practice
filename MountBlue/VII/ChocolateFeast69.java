/*
01-July-26
*/

public class ChocolateFeast69 {
    public static int chocolateFeast(int n, int c, int m) {
       //initial chocolates bought with cash
       int chocolates = n/c;

       //initial wrappers on hand equal to chocolates eaten
       int wrappers = chocolates;
       while (wrappers>=m) {
          int freeChocolates = wrappers/m;
          chocolates += freeChocolates;
          wrappers = (wrappers%m) + freeChocolates;
       }

       return chocolates;
    }
    
    public static void main(String[] args) {
        int n=15;   //10    12    6     15  
        int c=3;    //2     4     2     3
        int m=2;    //5     4     2     2
                    //6     3     5     9

        System.out.println(chocolateFeast(n, c, m));
    }
}