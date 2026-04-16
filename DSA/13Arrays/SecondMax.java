public class SecondMax {
    public static void main(String[] args) {
        // int a[] ={11,2,1,5,8,10,3};
        int a[] = { 11,11, 2,11, 1, 5, 8, 10, 3 };
        //int a[] = { -2, -1, -9, -8 };
        //int a[] = { -2, -2, -2, -2 };
        int max = Integer.MIN_VALUE;
        int secondMax= Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max){
                secondMax= max;
                max = a[i];
            }
            else if(a[i]>secondMax && a[i]!=max){
                secondMax = a[i];
            }
        }
        System.out.println(secondMax);
    }
}
