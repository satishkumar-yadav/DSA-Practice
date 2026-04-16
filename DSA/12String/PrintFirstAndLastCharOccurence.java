
/*
  i/p : "java"      ,    o/p : j=1,  a=2

*/


public class PrintFirstAndLastCharOccurence {
    
    static void countOccurence(String s){
        char c[] = s.toCharArray();
            int i=0;
            int scount = 1;
            int lcount = 1;
        
            for (int j = i + 1; j < c.length-1; j++) {
                if (c[i] == c[j]) 
                    scount++;
                   
                if (c[c.length-1] == c[j])
                    lcount++;    
            }
        System.out.print(c[0] + " : " + scount+" , "+c[c.length-1]+" : "+lcount);
    }

    public static void main(String[] args) {
        String s = "javaapjjiajpa";

        countOccurence(s);
    }

}
