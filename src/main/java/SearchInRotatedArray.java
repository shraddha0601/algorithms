/**
 * Created with IntelliJ IDEA.
 * User: shraddha
 * Date: 3/25/15
 * Time: 8:56 AM
 * To change this template use File | Settings | File Templates.
 */
public class SearchInRotatedArray {
    public static void main(String[] args) {
        int[] a = {5,6,7,1,2,3,4};
        int index = searchInRotatedArray(a, 4, 0, a.length-1);
        System.out.println("Element found at index: " + index);
    }

    private static int searchInRotatedArray(int[] a, int x, int start, int end) {
        int mid = (start+end)/2;
        if (a[mid] == x) {
            return mid;
        }
        if(a[start] < a[mid] ) {
            if (x>=a[start] && x<a[mid]) {
                return searchInRotatedArray(a, x, start, mid-1);
            } else {
                return searchInRotatedArray(a, x, mid+1, end);
            }

        } else if (a[mid] <a[end]) {
            if (x>a[mid] && x<=a[end]) {
                return searchInRotatedArray(a, x, mid+1, end);
            } else {
                return searchInRotatedArray(a, x, start, mid-1);
            }
        }
        return -1;
    }
}
