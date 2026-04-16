public class ReplaceConsecutiveCharWithAlter$ {
    
  static void findConsecutive(String s) {
    char ch[] = s.toCharArray();
    int l = ch.length;
    // System.out.println(l);
    int i = 0;
    int j = i + 1;

    if (l % 2 == 0) {
      while (i < l - 1 && j < l) {
        if (ch[i] == ch[j]) {
          // System.out.print(ch[i] + " , " + ch[j] + " ");
          ch[j] = '$';
        }

        System.out.print(ch[i] + "" + ch[j]);

        i += 2;
        j = i + 1;
      }
    }

  }

  public static void main(String[] args) {
       String s = "Bossss";   // o/p : Bos$         ,  i/p : Bossss , o/p : Bos$s$   
       
       findConsecutive(s);
  }

}
