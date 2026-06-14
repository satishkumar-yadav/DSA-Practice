public class SherlockAndSquares43 {
    public static int squares3(int a, int b) {
        int count=0;
        int m=a;

        while (m<=b) {
            for (int i = (int) Math.sqrt(m); i <= (int) Math.sqrt(b); i++) {
                 System.out.println("i: "+i+", m: "+m+", a: "+a+", b: "+b);
                    if (i * i == m) {
                        count++;
                    }
                // System.out.println("i: " + i + ", m: " + m + ", a: " + a + ", b: " + b);
            }
            m++;
        }
        return count;
    }

    public static int squares(int a, int b) {
        int count = 0;
        
        int base = (int) Math.sqrt(a);
        while (base*base<=b) {
            if(base*base>=a) count++;
            base++;
        }

        return count;
    }

    public static int squares1(int a, int b) {
       int st= (int) Math.ceil(Math.sqrt(a));
      // int end = (int) Math.ceil(Math.sqrt(b));
       int endBound = (int) Math.floor(Math.sqrt(b));  //safer

       if(st>endBound) return 0;

       return endBound-st+1;   // count = sqrt(b)-sqrt(a)+1
    }

    public static void main(String[] args) {
        int a = 24;
        int b=49;

       // System.out.println((int)Math.sqrt(24));

        System.out.println(squares(a, b));
    }
}
