/**
 * Created with IntelliJ IDEA.
 * User: shraddha
 * Date: 3/9/15
 * Time: 10:43 PM
 * To change this template use File | Settings | File Templates.
 */
public class GCDLCM {
    public static void main(String[] args) {
        int a = 15;
        int b = 35;

        System.out.println("GCD: " + gcd(a, b));
        System.out.println("LCM: " + lcm(a, b));

    }

    private static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }

    private static int gcd(int x, int y) {
        int r;
        while (y>0) {
            r = x%y;
            x=y;
            y=r;
        }

        return x;
    }
}
