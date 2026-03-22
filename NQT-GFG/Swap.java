public class Swap {

    //traditional swap using 3rd variable
   static void swap(int a, int b)
    {
       int temp = a;
       a = b;
       b = temp;

       System.out.println("a : "+a+" , b : "+b);
    }

    //swap without using 3rd variable
   static void swap2(int a, int b) 
    {
        a = a+b;   // a=5+3=8
        b = a-b;   // b=8-3=5
        a = a-b;   // a=8-5=3

        System.out.println("a : " + a + " , b : " + b);
    }

    // swap using exor 
    /*
       same number xor = 0  => 5^5 = 0101 ^ 0101 = 0000 (0)
       number xor 0 = same number  => 7 ^ 0 = 0111 ^ 0000 = 0111 (7)
    */
   static void swap3(int a, int b) {
        // a = 5(0101) ,  b= 3(0011)

        a = a^b;  // a= 5^3 = 0101 ^ 0011 = 0110 (6)
        b = a^b;  // b= 6^3 = 0110 ^ 0011 = 0101 (5)
        a = a^b;  // a= 6^5 = 0110 ^ 0101 = 0011 (3)

        System.out.println("a : " + a + " , b : " + b);
    }

    public static void main(String[] args) {
        int a = 5, b=3 ;

        swap(a,b);

        swap2(a, b);

        swap3(a, b);
    }
}
