/**
 * Created with IntelliJ IDEA.
 * User: shraddha
 * Date: 4/21/15
 * Time: 3:52 PM
 * To change this template use File | Settings | File Templates.
 */
public class CoinChange {
    public static void main(String[] args) {
        int amt = 7;
        int[] S = {25, 10, 5, 1};
        System.out.println("No of ways to make coin change: " + makeCoinChange(amt, 25));
        System.out.println("No of ways to make coin change: " + count(S, S.length, amt));
    }

    private static int makeCoinChange(int amt, int denom) {
        int next_denom=0;
        switch(denom) {
            case 25: next_denom = 10; break;
            case 10: next_denom = 5; break;
            case 5: next_denom = 1; break;
            case 1: return 1;
        }

        int ways = 0;
        for (int i=0; i*denom <amt; i++) {
            ways += makeCoinChange(amt-i*denom, next_denom);
        }
        return ways;
    }

    static int count( int S[], int m, int n )
    {
        // If n is 0 then there is 1 solution (do not include any coin)
        if (n == 0)
            return 1;

        // If n is less than 0 then no solution exists
        if (n < 0)
            return 0;

        // If there are no coins and n is greater than 0, then no solution exist
        if (m <=0 )
            return 0;

        // count is sum of solutions (i) including S[m-1] (ii) excluding S[m-1]
        return count( S, m - 1, n ) + count( S, m, n-S[m-1] );
    }
}
