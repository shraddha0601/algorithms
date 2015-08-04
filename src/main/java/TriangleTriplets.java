import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: shraddha
 * Date: 3/12/15
 * Time: 10:40 PM
 * To change this template use File | Settings | File Templates.
 */
public class TriangleTriplets {
    public static void main(String[] args) {
        int[] a = {9,8,10,7,5,4};
        // {4,5,7,8,9,10}
        // {1,2,6,56,78}
        printTriangleTriplets(a);
        System.out.println("***************");
        printTriangleTriplets2(a);
    }

    private static void printTriangleTriplets(int a[]) {
        Arrays.sort(a);
        for (int i=0;i<a.length-2;i++) {
            for(int j=i+1;j<a.length-1; j++) {
                int k=j+1;
                while(k < a.length && (a[i] + a[j] > a[k])) {
                        System.out.println(a[i] + " " + a[j] + " " + a[k]);
                    k++;
                }
            }
        }
    }

    // wrong, don't do this
    private static void printTriangleTriplets2(int a[]) {
        Arrays.sort(a);
        for (int k=a.length-1; k>=2; k--) {
            int i=0;
            int j=k-1;
            while(i<j) {
                if (a[i] + a[j] > a[k]) {
                    System.out.println(a[i] + " " + a[j] + " " + a[k]);
                    j--;
                } else {
                    i++;
                }
            }
        }
    }
}
