import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BigSorting45 {
    public static List<String> bigSorting(List<String> unsorted) {
          Collections.sort(unsorted,new Comparator<String>() {
               @Override
               public int compare(String s1, String s2){
                   //comparing length first
                   if(s1.length() != s2.length()) return s1.length()-s2.length();

                   //compare lexicographically if length are equal
                   return s1.compareTo(s2);
               }
          });

          return unsorted;
    }

    public static void main(String[] args) {
        List<String> ls = Arrays.asList("1","2","100","1230347984985734173084193741082938","3084193741082937",
                "3084193741082938", "3084193741082937","1","3","111","200","3","10","5");

        System.out.println(bigSorting(ls));
    }
}
