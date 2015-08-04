/**
 * Created with IntelliJ IDEA.
 * User: shraddha
 * Date: 2/26/15
 * Time: 10:59 PM
 * To change this template use File | Settings | File Templates.
 */
public class SubStringCount {
//    find the substring count from a string without string functions in java?


    public static void main(String[] args) {
        String testStr = "dfcdecdefkglhcdeu";
        String subStr = "cde";

        System.out.println("Substring count is: " + subStringCount(testStr, subStr));
    }

    private static int subStringCount(String testStr, String subStr) {
        int length = testStr.length();
        int subLength = subStr.length();
        int subCount = 0;
        int j = 0;
        for (int i=0; i<length; i++) {
            if (testStr.charAt(i) == subStr.charAt(j)) {
                j++;
                if (j==subLength) {
                    subCount += 1;
                    j=0;
                }
            }
            else {
                j=0;
            }
        }
        return subCount;
    }

}
