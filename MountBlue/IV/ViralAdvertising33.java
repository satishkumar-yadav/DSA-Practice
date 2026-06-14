/*

*/

public class ViralAdvertising33 {
    public static int viralAdvertising(int n) {
        int shared=0, liked=0, cumulative=0;
        for (int i = 1; i <=n; i++) { //i=day
            if(i==1) shared =5;
            else shared = liked*3;
            liked = shared/2;
            cumulative += liked;
        }
        return cumulative;
    }

    public static void main(String[] args) {
        int n =5;

        System.out.println(viralAdvertising(n));
    }
}
