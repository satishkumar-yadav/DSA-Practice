/*
16-6-26
*/

public class HalloweenSale50 {

    public static int howManyGames(int p, int d, int m, int s) {
        int gameBought=0;
        
        while(s-p>=0){
            if(s-p>=0){
                s -= p;
                gameBought++;
            }
            else break;

            if(p-d<m) p=m;
            else p -= d;
        }

        return gameBought;
    }

    public static void main(String[] args) {
        int p=20,
        d=3,
        m=6,
        s=82;

        System.out.println(howManyGames(p, d, m, s));
    }
    
}