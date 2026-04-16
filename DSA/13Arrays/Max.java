public class Max {
   public static void main(String[] args) {
    //int a[] ={9,2,1,5,8,10,3};
    int a[] = {-2,-1,-9,-8};
    int max=a[0];
    for(int i=0; i<a.length; i++)
    {
        if(a[i]>max) max=a[i];
    }
    System.out.println(max);
   }

}