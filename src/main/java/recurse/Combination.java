package recurse;

/**
 * Created with IntelliJ IDEA.
 * User: shraddha
 * Date: 3/4/15
 * Time: 8:28 PM
 * To change this template use File | Settings | File Templates.
 */
public class Combination {
    private static String str;

    public static void main(String[] args) {
        str = "abcd";
        Boolean[] used = new Boolean[str.length()];
        StringBuffer output = new StringBuffer(str.length());
        printComb( output, 0, str.length());
    }

    private static void printComb(StringBuffer output, int start, int length) {
        for (int i = start; i < length; i++) {
            output.append(str.charAt(i));
            System.out.println(output.toString());
            printComb(output, i + 1, length);
            output.setLength(output.length() - 1);
        }
    }
}
