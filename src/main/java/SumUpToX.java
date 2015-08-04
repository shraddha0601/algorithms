import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: shraddha
 * Date: 2/24/15
 * Time: 11:12 PM
 * To change this template use File | Settings | File Templates.
 */
public class SumUpToX {
    public static void printPairs(int[] list, Integer sum) {
        Arrays.sort(list);
        for (int i=0; i<list.length; i++) {
            int toFind = sum - list[i];
            if (foundInArray(list, i, toFind)) {
                System.out.println("Pair found: " + list[i] + "and " + toFind);
            }
        }

    }

    private static boolean foundInArray(int[] list, int i, int toFind) {
        int start = i + 1;
        int end = list.length - 1;

        while (start<end) {
            int mid = start + (end - start) / 2;
            if (list[mid] == toFind) {
                return true;
            }
            if (toFind < list[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] a = {24, 45, -8, 10, 6, 16, 0, 1, 15};
        Integer sum = 16;
//        printPairs(a, sum);
        printPairsUsingHashMap(a, sum);
    }

    private static void printPairsUsingHashMap(int[] a, Integer sum) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i=0; i<a.length; i++) {
            map.put(a[i], 1);
        }

        for (int i=0; i<a.length; i++) {
            Integer numToFind = sum-a[i];
            if (map.get(numToFind) != null) {
                map.put(a[i], null);
                System.out.println("Pair found: " + a[i] + "and " + numToFind);
            }
        }
    }
}
