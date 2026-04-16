public class SortString {
    
    public static void sort(String s){
      char ch[] = s.toCharArray();

      for (int i = 0; i < ch.length-1; i++) {
        for (int j = i+1; j < ch.length; j++) {
            if(ch[i]>ch[j]){
                char temp = ch[i];
                ch[i] = ch[j];
                ch[j] = temp;
            }
        }
      }
      System.out.print(ch);

    }

    public static void main(String[] args) {
        String s="javadev";

        sort(s);
    }

}
