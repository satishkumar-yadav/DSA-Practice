
/*
print ocurence of all duplicate char,  if no duplicate print original string
i/p : java ,  o/p : a=2
i/p : ram ,    o/p : ram
i/p : ssmbb ,  o/p : s=2, b=2
*/

public class PrintOccurenceOfOnlyDupChar {
    
    static void countDup(String s) {
      
        boolean duplicateFound = false;
        for (int i = 0; i < s.length(); i++) { 
            char c = s.charAt(i);
          
            int count = 0;
           //count occurences
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == c)
                    count++;
            }

            // check if already printed
            boolean alreadyPrinted = false;
            for (int k = 0; k < i; k++) {
                if (s.charAt(k) == c)
                {
                    alreadyPrinted = true;
                    break;
                }
            }

           if (count>1 && !alreadyPrinted) {
               System.out.println(c+" = "+count);
               duplicateFound = true;
           }
        }

        if (!duplicateFound) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        String s1= "java";
        String s2= "ram";
        String s3 = "bbaccc";
        // String s4 = "Hello World";
        // String s5 = "Ramana Kumar";

        countDup(s1);
        countDup(s2);
        countDup(s3);
    }

}
