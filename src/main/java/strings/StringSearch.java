package strings;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: shraddha
 * Date: 8/4/15
 * Time: 11:31 AM
 * To change this template use File | Settings | File Templates.
 */
public class StringSearch {
    public static void main(String[] args) {
        String[] stringArr = { "zen", "color", "ab", "true", "abc", "apple"};
        int index = findString(stringArr, "true");
    }

    private static int findString(String[] stringArr, String searchStr) {

        Arrays.sort(stringArr);


        int start = 0;
        int end = stringArr.length - 1;

        while(start<=end) {
            int mid = (start + end) /2;
            System.out.println("Mid is : " + mid);

            int compare = stringArr[mid].compareTo(searchStr);
            if(compare == 0) {
                System.out.println("String found at: " + mid);
                return mid;
            } else if (compare > 0) {
                end = mid -1;
            } else {
                start = mid + 1;
            }
        }
        System.out.println("Search string not found");
        return -1;

    }
}
