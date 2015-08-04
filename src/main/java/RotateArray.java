/**
 * Created with IntelliJ IDEA.
 * User: shraddha
 * Date: 3/26/15
 * Time: 6:17 PM
 * To change this template use File | Settings | File Templates.
 */
public class RotateArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 3,4,5,6,7,8,9};
        int num = 2;
        rotateArray(a, num);
        int av =1;
    }

    private static void rotateArray(int[] a, int num) {
        // rotate first part
        int end = a.length - num -1;
        for (int i=0;i<=end/2; i++) {
            int temp = a[i];
            a[i] = a[end-i];
            a[end-i]=temp;
        }

        // rotate second part
        int start = end+1;
        int n=a.length-1;
        for(int i=start; i<=(start+a.length-1)/2; i++) {
            int temp = a[i];
            int endel = n;
            a[i] = a[endel];
            a[endel]=temp;
            n--;
        }

        // rotate the whole array
        n=a.length-1;
        for (int i=0; i<=n/2; i++) {
            int temp = a[i];
            a[i] = a[n-i];
            a[n-i]=temp;
        }
        return;
    }
}
