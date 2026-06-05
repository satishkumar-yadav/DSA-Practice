/*
27

*/

public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int index=0;   // pointer to track position of valid element
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=val){
                nums[index]= nums[i];
                index++;
            }
        }

        return index;
    }  

    public static void main(String[] args) {
        int nums[] = { 0, 1, 2, 2, 3, 0, 4, 2};
        int val =2 ;
        // o/p : [0,1,4,0,3,_,_,_]

        System.out.println(removeElement(nums, val));
    }
}
