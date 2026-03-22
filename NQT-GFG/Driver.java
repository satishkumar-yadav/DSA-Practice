public class Driver {

     //Random Input Generator
    // static int[] generate(int n){
    //     Random r = new Random();
    //     int []arr = new int[n];
    //     for(int i=0; i<n; i++){
    //         arr[i]=r.nextInt(100000);
    //     }
    //     return arr;
    // }
 
    public static void main(String []args){
        Solution sol = new Solution();

        // sql question mandi
        // Test Cases----------
        int [][] testCases = {
            {1,4,3,2,6,5},
            {1,2,3,4,5},
            {1, 8, 7, 56, 90},
            {1, 3, 4, 2, 6, 5, 8, 7},
            {4,4,4,4,4},
            {5,5,5},
            {1,3,3},
            {4,5,2},
            {1,-2,3,-4,5,-9},
            {10},
            {},
        };

        for(int i=0; i<testCases.length; i++){
            System.out.println("Test Case " + (i+1));
            System.out.println(testCases.length+" - "+testCases[0].length+ " , " +"Input : ");
            for (int j=0; j<testCases.length;j++ ) {
                for (int k = 0; k < testCases[j].length; k++) {
                     System.out.print(" "+testCases[j][k]+ " ");
                }
                System.out.println();
              
            }
            // s.solve(testCases[i]);
           System.out.println();

         //Practical Time Complexity
        long startTime= System.nanoTime();
        // long start = System.currentTimeMillis();

        //Practical Space Complexity
       Runtime rt = Runtime.getRuntime();
       rt.gc();   // request GC (not guaranteed)
       long memBefore = rt.totalMemory()-rt.freeMemory();


       // int result = sol.solve(testCases[i]);
        int res[] = sol.solve(testCases[i]);

        long endTime = System.nanoTime();
        long memAfter = rt.totalMemory()-rt.freeMemory();

        for (int j = 0; j < testCases.length; j++) {
            System.out.print("Output : " + res[i] + " ");
        }
        System.out.println();
       // System.out.println(" Output : "+result);
        System.out.println(" Time Taken : "+(endTime-startTime)+" ns");
        System.out.println(" Memory Used : "+(memAfter-memBefore)+" bytes");
        System.out.println(" ---------------------------------------- ");
        System.out.println();

        }
    } 
}
