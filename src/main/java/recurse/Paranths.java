package recurse;

public class Paranths {
    public static void main(String[] args) {
        noWaysParanths(3);
    }

    private static void noWaysParanths(int numP) {
        char[] ways = new char[2*numP];
         noWaysParanths(numP, numP, ways, 0);
    }

    private static void noWaysParanths(int l, int r, char[] a, int i) {
        if (l == 0 && r == 0) {
            System.out.println(a);
            System.out.println("******");
            return;
        }
            if (l > 0) {
                a[i] = '(';
                noWaysParanths(l-1, r, a, i + 1);
            }


            if (r > l && r>0) {
                a[i] = ')';
                noWaysParanths(l, r-1, a, i + 1);
            }


    }


}
