/**
 * Created with IntelliJ IDEA.
 * User: shraddha
 * Date: 3/8/15
 * Time: 1:10 PM
 * To change this template use File | Settings | File Templates.
 */
public class Power {
    public static void main(String[] args) {

        System.out.println(inEfficientPower(10, 4));
    }

    public static double power(double x, int n) {
        if (n == 0)
            return 1;

        double v = power(x, n / 2);

        if (n % 2 == 0) {
            return v * v;
        } else {
            return v * v * x;
        }
    }

    public static double pow(double x, int n) {
        if (n < 0) {
            return 1 / power(x, -n);
        } else {
            return power(x, n);
        }
    }

    public static float inEfficientPower(long x, int n) {
        if (n < 0) {
            return 1 / inEff(x, -n);
        } else {
            return inEff(x, n);
        }
    }

    // Note: if return type is long/Long, the negative power returns 0. Not the expected result
    private static float inEff(long x, int n) {
        float result = 1;
        for (int i=0;i<n;i++) {
            result *= x;
        }
        return result;
    }

}
