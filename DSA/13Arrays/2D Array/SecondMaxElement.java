class SecondMaxElement{
    public static void main(String[] args) {
        int a[][] = {{7,2,0},
                      {4,7,-3},
                      {-6,0,9}};
         
       int max =Integer.MIN_VALUE;
       int secondMax=Integer.MIN_VALUE;
       
       for(int []n:a){
        for (int m : n) {
            if (m > max) {
                secondMax = max;
                max = m;
            } else if (m > secondMax && m != max) {
                secondMax = m;
            }
        }
       }

       System.out.println("Max : "+max+" , SecondMax : "+secondMax);
       //System.out.print(Arrays.deepToString(a));
    }
}