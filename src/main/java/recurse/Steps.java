package recurse;


public class Steps {
    public static void main(String[] args) {
        System.out.println("No of ways: " + waysToClimbSteps(4));
    }

    private static int waysToClimbSteps(int n) {
        if (n<0) {
            return 0;
        }

        if (n==0) {
            return 1;
        }

        return waysToClimbSteps(n-1) + waysToClimbSteps(n-2) + waysToClimbSteps(n-3);
    }


}
