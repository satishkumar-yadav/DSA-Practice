
/*
  Replace Char with its occurence count if its repeating

          1 2 1      2   3
i/p : H e l l o    W o r l d         o/p : He121 W2r3d

*/


public class PrintOccurenceCountOfOnlyDupChar {

    static void countDup(String s) { 
        String res = "";
        // String countIndex = "";
        // String charList = "";
                                                     //     ij
        for (int i = 0; i < s.length(); i++) {         // Hello World
             char c = s.charAt(i);
            if(c == ' '){
                res += " ";
                continue;
            }

            int currentCount =0;
            int totalCount = 0;

             // count total occurence
             for (int j = 0; j <s.length(); j++) {
                 if (s.charAt(j) == c)
                     totalCount++;
             }

             // count occurence till index
            // countIndex += count;
            for(int j=0; j<=i; j++){
                if(s.charAt(j)==c) currentCount++;
            }
                   
            if(totalCount==1) res += c;
            else res += currentCount;
        }

        System.out.println(res);
    }

   

    public static void main(String[] args) {
        String s1 = "Hello World";
        String s2 = "Ramana Kumar";

      countDup(s1);
      countDup(s2);
    }
}
