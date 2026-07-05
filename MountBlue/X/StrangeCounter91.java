/*
04-July-26
*/
class StrangeCounter91 {
    //upto 10^9 fine, later takes too much time
    public static long strangeCounter2(long t) {
        long initialVal =3; 
        long tc = initialVal;

        for (long i = 2; i <= t; i++) {
            if (tc == 1) {
                initialVal *= 2;
                tc = initialVal;
                continue;
            }
            tc--;
        }

        return tc;
    }

    //optimise sol
    public static long strangeCounter(long t) {
        long initialVal = 3;

        //keep jumping through cycles as long as 't' lies past the current cycle length
        while(t>initialVal){
            t -= initialVal;  // subtracting full duration of this cycle
            initialVal *= 2;  // next cycle is twice as long
        }

        //at this point, 't' represents the relative second inside this specific cycle
        return initialVal-t+1;
    }    

    public static void main(String[] args) {
         long t = 1000000000000L;
         
         System.out.println(strangeCounter(t));
    }
    
}