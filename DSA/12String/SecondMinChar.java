public class SecondMinChar {
    
    static void secondMinChar(String s){
      char minchar1= ' ', minchar2 = ' ';
      int mincount1= s.length(), mincount2 = s.length();
      
      while(s.length()>0){
        char ch= s.charAt(0);
        String s2= s.replace(ch+"", "");
        int count = s.length()- s2.length();

        if(count<mincount1){
            mincount2=mincount1;
            minchar2=minchar1;
            mincount1=count;
            minchar1=ch;
        }
        else if(count <mincount2 && count != mincount1){
           mincount2=count;
           minchar2=ch;
        }
        s=s2;
      }

      System.out.println("minChar : "+minchar1+" = "+mincount1+ " , secondMinChar : "+minchar2+" = "+mincount2);
    }

    public static void main(String args[]){
        String s="ramana kumar";

      secondMinChar(s);
    }
}
