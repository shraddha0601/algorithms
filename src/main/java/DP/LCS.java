package DP;

/**
 * http://www.geeksforgeeks.org/dynamic-programming-set-4-longest-common-subsequence/
 */
public class LCS {
    public static void main(String[] args) {
        String a = "ABCDGH";
        String b = "AEDFHR";

        System.out.println("Recursive LCS: " + lcsRecursive(a, b, a.length(), b.length()));
        System.out.println("Recursive LCS: " + lcsDP(a, b, a.length(), b.length()));
    }

    private static int lcsDP(String a, String b, int al, int bl) {
        int[][] lcs = new int[al+1][bl+1];


        for (int i=0; i<=al; i++) {
            for (int j=0; j<=bl; j++) {
                if (i==0 || j==0) {
                    lcs[i][j] = 0;
                    continue;
                }
                if(a.charAt(i-1) == b.charAt(j-1)) {
                    lcs[i][j] = 1 + lcs[i-1][j-1];
                } else {
                    lcs[i][j] = Math.max(lcs[i-1][j], lcs[i][j-1]);
                }
            }
        }
        return lcs[al][bl];
    }

    /**
     * O(2^n)
     */
    private static int lcsRecursive(String a, String b, int al, int bl) {
        if (al == 0 || bl==0) return 0;
        if(a.charAt(al-1) == b.charAt(bl-1)) {
            return 1 + lcsRecursive(a, b, al-1, bl-1);
        } else {
          return Math.max(lcsRecursive(a, b, al-1, bl), lcsRecursive(a,b,al,bl-1));
        }
    }


}
