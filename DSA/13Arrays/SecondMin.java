public class SecondMin {
    public static void main(String[] args) {
        int a[] = {1,1, 9, 2, 3, 5, 8, 10, 3 };
        // int a[] = { -2, -1, -9, -8 };
        // int a[] = { -2, -2, -2, -2 };
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                secondMin = min;
                min = a[i];
            } else if (a[i] < secondMin && a[i] != min) {
                secondMin = a[i];
            }
        }
        System.out.println(secondMin);
    }
}
