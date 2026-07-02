/*
01-July-26
*/



class TaumAndBday71 {
    public static long taumBday(int b, int w, int bc, int wc, int z) {
       //buy black gift directly, or buy white and convert them
       long optimalBc= Math.min(bc, wc+z);

       //buy white gifts directly, or buy black and convert them
       long optimalWc = Math.min(wc, bc+z);

       return (b*optimalBc)+(w*optimalWc);

    }
    
    public static void main(String[] args) {
        int b=3;
        int w=6;
        int bc=9;
        int wc=1;
        int z=1;

        System.out.println(taumBday(b, w, bc, wc, z));
    }
}