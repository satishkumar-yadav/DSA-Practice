import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SequenceEquation40 {
    public static List<Integer> permutationEquation2(List<Integer> p) {
       List<Integer> res = new ArrayList<>();
          for (int i = 1; i < p.size(); i++) {
            for(int j=1; j<p.size();j++){
               if(i==p.get(j)){
                res.add(j);
                break;
               }
            }
          }

       return res;
    }

    public static List<Integer> permutationEquation(List<Integer> p) {
       int n=p.size();
       //creating array to map value to their 1-indexed pos
       int [] pos = new int[n+1];  // size=n+1 as it is 1-indexed based

       //if(p.get(i)==v), then value v is at position  (i+1)
       for (int i = 0; i < n; i++) {
          int value=p.get(i);
          pos[value]= i+1;
       }

       List<Integer> res = new ArrayList<>();

       //finding y for each x
       for(int x=1; x<=n;x++){
        int intermediatePos = pos[x];   //finding where x is located - gives intermediate value p(y)

        //now finding where that intermediatePos value is located - gives target value 'y'
          int y = pos[intermediatePos];
          res.add(y);
       }

       return res;
    }

    public static void main(String[] args) {
        List<Integer> ls = Arrays.asList(5,2,1,3,4);

        System.out.println(permutationEquation(ls));
    }
}
