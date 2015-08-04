import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created with IntelliJ IDEA.
 * User: shraddha
 * Date: 3/9/15
 * Time: 5:32 PM
 * To change this template use File | Settings | File Templates.
 */
public class Number {

    //psvm tab game me this main method
    public static void main(String[] args) {

        System.out.println(isNumber("-0.12"));
        System.out.println(isNumber2("-0.12aa"));
        String b = "This";
        String[] a = b.split(" ");
        int a1 = 1;
    }

    public static boolean isNumber(String str) {
        if(str==null) return false;

        String pattern = "^(-)?[0-9]+(\\.)?[0-9]+$";
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(str);
        if (m.find( )) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isNumber2(String str) {
        String[] parsed = str.split("^(-)?[0-9]+(\\.)?[0-9]+$");
        return  (parsed.length) == 0;
    }
}
