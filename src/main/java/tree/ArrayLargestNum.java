package tree;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: shraddha
 * Date: 3/26/15
 * Time: 6:46 PM
 * To change this template use File | Settings | File Templates.
 */
public class ArrayLargestNum {
    public static void main(String[] args) {
        List<Integer> a= Arrays.asList(9, 90, 900, 999);
        arrayFOrmLargestNum(a);
    }

    private static void arrayFOrmLargestNum(List<Integer> a) {
        Collections.sort(a, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                Integer num1 = Integer.parseInt(o1.toString()+o2.toString());
                Integer num2 = Integer.parseInt(o2.toString()+o1.toString());
                return num2.compareTo(num1);
            }
        });
        for (Integer e : a) {
            System.out.print(e);
        }
    }
}
