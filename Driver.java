public class Driver {

     //Random Input Generator
    static int[] generate(int n){
        Random r = new Random();
        int []arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=r.nextInt(100000);
        }
        return arr;
    }

    public static void main(String []args){
        Solution sol = new Solution();

        // sql question mandi
        // Test Cases----------
        int [][] testCases = {
            {1,2,3,4,5},
            {5,5,5},
            {},
            {10},
            {1,-2,3,-4,5}
        };

        for(int i=0; i<testCases.length; i++){
            System.out.println("Test Case " + (i+1));
            // s.solve(testCases[i]);
        

         //Practical Time Complexity
        long startTime= System.nanoTime();
        // long start = System.currentTimeMillis();

        //Practical Space Complexity
       Runtime rt = Runtime.getRuntime();
       rt.gc();   // request GC (not guaranteed)
       long memBefore = rt.totalMemory()-rt.freeMemory();

        int result = sol.solve(testCases[i]);

        long endTime = System.nanoTime();
        long memAfter = rt.totalMemory()-rt.freeMemory();

        System.out.println("\n Output : "+result);
        System.out.println(" Time Taken : "+(endTime-startTime)+" ns");
        System.out.println(" Memory Used : "+(memAfter-memBefore)+" bytes");
        System.out.println(" ---------------------------------------- ");

        }
    } 
}
