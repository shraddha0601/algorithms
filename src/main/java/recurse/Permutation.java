package recurse;

/**
 * Created with IntelliJ IDEA.
 * User: shraddha
 * Date: 3/4/15
 * Time: 10:35 AM
 * To change this template use File | Settings | File Templates.
 */
public class Permutation {

    private static String str;

    public static void main(String[] args) {
        str = "abcd";
        Boolean[] used = new Boolean[str.length()];
        StringBuffer output = new StringBuffer(str.length());
        printPermute(used, output, 0, str.length());
    }

    private static void printPermute(Boolean[] used, StringBuffer output, int level, int length) {
        if (output.length() == str.length()) {
            System.out.println(output.toString());
            return;
        }

        for (int i=0; i<length ; i++) {
            if (used[i]!=null && used[i]) {
                continue;
            }
            output.append(str.charAt(i));
            used[i] = true;
            printPermute(used, output, level + 1, length);
            used[i] = false;
            output.setLength(output.length()-1);
        }
    }
}
