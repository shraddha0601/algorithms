package recurse;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: shraddha
 * Date: 3/19/15
 * Time: 11:29 PM
 * To change this template use File | Settings | File Templates.
 */
public class AllPickings {
    public static void main(String[] args) {
        List<int[]> sets = new ArrayList<int[]>();
        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5,6};
        int[] arr3 = {7,8};
        sets.add(arr1);
        sets.add(arr2);
        sets.add(arr3);
        findAllPickings(sets, 0, "");
    }

    public static void findAllPickings(List<int[]> sets, int pos, String result) {
        if(pos == sets.size())
            System.out.println(new String(result));
        else {
            int[] currentSet = sets.get(pos);
            for(int i = 0; i < currentSet.length; i++) {
                String currentString = result + currentSet[i];
                findAllPickings(sets, pos+1, currentString);
            }
        }
    }


}
