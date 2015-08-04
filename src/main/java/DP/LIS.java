package DP;

/**
 * http://www.geeksforgeeks.org/dynamic-programming-set-3-longest-increasing-subsequence/
 *  O(n^2)
 */
public class LIS {
    public static void main(String[] args) {
//        int a[] = { 10, 22, 9, 33, 21, 50, 41, 60 };
        int a[] = { 1,2,4,0, 4, 5, 6, 7 };
        System.out.println("Longest increasing subsequence is: " + lis(a));
    }

    private static int lis(int[] a) {
        int max = 0;
        int[] lis = new int[a.length];

        for (int i = 0; i<a.length; i++) {
            lis[i] = 1;
        }

        for (int i = 1; i<a.length; i++) {
            for (int j=0; j<i; j++) {
                if ((a[i] > a[j]) && (lis[i] < lis[j] + 1) ) {
                    lis[i] = lis[j] + 1;
                }
            }
        }

        // find max
        for (int i = 0; i<a.length; i++) {
            max = Math.max(max, lis[i]);
        }
        return max;
    }
}
