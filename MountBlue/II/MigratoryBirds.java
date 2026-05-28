import java.util.ArrayList;
import java.util.List;

public class MigratoryBirds {
     public static int migratoryBirds(List<Integer> arr) {
         int[] freq = new int[6]; // since bird's ids are only 1,2,3,4,5

         // counting freq of each id
         for (int id : arr)
             freq[id]++;

         int maxFreq = 0, birdId = 0;

         // finding id with highest freq
         for (int i = 1; i <= 5; i++) {
             if (freq[i] > maxFreq) {
                 maxFreq = freq[i];
                 birdId = i;
             }
         }
         return birdId;
    }

    public static void main(String[] args) {
       // int []tmpArr = {1,1,2,2,3};
        int []tmpArr = {1,4,4,4,5,3};
        //int []tmpArr = {1,1,2,2,3};
        List<Integer> arr = new ArrayList<>();
        for(int n:tmpArr) arr.add(n);

        System.out.println(migratoryBirds(arr));
    }
}
