
/*
   i/p : Happy Happy Birthday To You You
   o/p : Happy Birthday to You
*/

public class RemoveDuplicateWithoutContains {
    
    public static void remDup(String s){
      String str[] = s.split(" ");

      for (int i = 0; i < str.length; i++) {
        if(str[i]=="") continue;
        for (int j = i+1; j < str.length; j++) {
            if(str[i].equals(str[j])) 
                str[j]=""; 
        }
        System.out.print((str[i]+" "));
      }
      
    }

    public static void main(String[] args) {
        String s = "Happy Happy Birthday to You You";

        remDup(s);
    }

}
