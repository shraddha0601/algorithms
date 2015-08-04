import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: shraddha
 * Date: 3/11/15
 * Time: 11:51 PM
 * To change this template use File | Settings | File Templates.
 */
public class RepeatedSubString {
    public static void main(String[] args) {
        String str = "abcdabcdab";
        Map<String, Integer> map = getRepeatedSubStringsOfLength3(str);
        int a = 1;
    }

    private static Map<String, Integer> getRepeatedSubStringsOfLength3(String str) {
        Map<String, Integer> map = new HashMap<String, Integer>();

        for (int i=0; i<str.length(); i++) {
            if (i + 3 <= str.length()) {
                String subStre = str.substring(i, i + 3);
                if (map.containsKey(subStre)) {
                    int count = map.get(subStre);
                    count += 1;
                    map.put(subStre, count);
                } else {
                    map.put(subStre, 1);
                }
            }
        }

        return map;
    }

}
