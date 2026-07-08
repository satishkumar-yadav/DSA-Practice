/*
07-July-26
*/

public class CounterGame118 {

    //using bitwise
    public static String counterGame2(long n) {
       //find no of '1' bits in (n-1)
       int totalMoves = Long.bitCount(n-1);
       // if total move made is odd Louise wins, else Richard wins
       if (totalMoves % 2 != 0) return "Louise";
       else  return "Richard";
    }    

    public static String counterGame(long n) {
        int moveCount =0;

        //keep playing game until counter is reduced to 1
        while (n>1) {
            //check if n is power of 2
            if((n & (n-1))==0) n /= 2;  //divide by 2
            else{
                long largestPowerOf2 = Long.highestOneBit(n);
                n -= largestPowerOf2;
            }
            moveCount++;  //tracking turn
        }

        //if total move made is odd Louise wins, else Richard wins
        if(moveCount % 2 !=0) return "Louise";
        else return "Richard";
    }

    public static void main(String[] args) {
        long n= 132;

       System.out.println(counterGame(n));
    }
    
}