/*
  
  s = j a v a _ _ i s _ _ _ e a s y
      i j

    till c != ' '  , j++
     i=0, j=1    a
     i=0, j=2    v
     i=0, j=3    a
     
     c == ' '  ,  
     //j=4  ,   i==j , j++
     till c == ' '
     i=4, j=4    _
 

*/


public class CountWords {
    public static void main(String[] args) {
        String s="     java   is     easy  ";
       //int i=0, j=0;  
       int sp=0, count=0;
        
      // M-I -> worked for single space between words
    //    while (i < s.length()) {
    //       if (s.charAt(i) == ' ') sp++;
    //        i++;
    //    }

      for (int i = 0; i < s.length(); i++) {

          if (s.charAt(i) != ' ' && (i == 0 || s.charAt(i - 1) == ' ')) {
              count++;
          }

      }

    //   while (j < s.length()) {
    //   if (s.charAt(j) == ' ') i++;

    //   j++;
    //   }

        // while (j<s.length() && i<s.length()) {
        //     if(s.charAt(j) != ' ') {j++; }
        //     else if(s.charAt(j) == ' ') {j++; i++;}
        //     else if(s.charAt(j) == ' ' && i!=j) {sp++; }
        // }
       // System.out.println("No of Words : " + (sp+1));
        System.out.println("No of Words : " + count);
    }
    
    
}
