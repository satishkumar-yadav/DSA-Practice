class UniqueChar {
    // Program to print Unique Letter from String (only non-repeating)

    static void printUnique(String s) {  // not working
        char c[] = s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            int count = 1;
            // if (c[i] == '\u0000')
            //     continue;
            for (int j = i + 1; j < c.length; j++) {
                if (c[i] == c[j]) {
                    count++;
                   // c[j] = '\u0000';
                }
            }

            if (count >1) c[i] = '\u0000';

            if (c[i] != '\u0000') 
                System.out.print(c[i]);
               
        }
    }

    static void printUnique1(String s) {
        char c[] = s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            int count = 1;
            if (c[i] == '\u0000')
                continue;
            for (int j = i+1; j < c.length; j++) {
                if (c[i] == c[j])
                {
                    count++;
                    c[j] = '\u0000';
                }
                    
            }
            if (count == 1)
                System.out.print(c[i]);
        }
    }

    static void printUnique2(String s){
         char c[] = s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            int count = 0;
            for (int j = 0; j < c.length; j++) {
                if (c[i] == c[j])
                    count++;
            }
            if (count == 1)
                System.out.print(c[i]);
        }
    }

    static void printUnique3(String s) {
        char c[] = s.toCharArray();

        for (int i = 0; i < c.length; i++) {
            boolean isDuplicate = false;

            // If this character is already marked as 'null', skip it
            if (c[i] == '\u0000')
                continue;
           
            // Look AHEAD for duplicates
            for (int j = i+1; j < c.length; j++) {
                if (c[i] == c[j])
                   {
                       isDuplicate = true;
                       c[j] = '\u0000'; // Mark the duplicate so we don't process it again
                   }
            }
            // if(count>1) c[i] = '\u0000';

            // if (c[i] != '\u0000') System.out.print(c[i]);

            // Only print if it was never found again AND it wasn't a duplicate
            if (!isDuplicate) {
                System.out.print(c[i]);
            }
        }
    }

    public static void main(String[] args) {
        String s = "Raamanammnpa";  // o/p : Rp
         
        // printUnique(s);  // not working

         printUnique1(s);
        // printUnique2(s);
        // printUnique3(s);
    }
}