/**
 * Created with IntelliJ IDEA.
 * User: shraddha
 * Date: 3/10/15
 * Time: 3:56 PM
 * To change this template use File | Settings | File Templates.
 */
public class CompressedString {
    public static void main(String[] args) {
        System.out.println(compressedString("aabbcccd"));
    }

    public static String compressedString(String originalStr) {

        StringBuffer newStr = new StringBuffer();
        int count=1;
        char prev = 0;
        for (int i=0; i<originalStr.length(); i++) {
            if (originalStr.charAt(i) == prev) {
                count++;
            } else {
                if (i>0) {
                    newStr.append(count);
                }
                newStr.append(originalStr.charAt(i));
                count=1;
            }

            prev = originalStr.charAt(i);

            // append count of the last character
            if (i==originalStr.length()-1) {
                newStr.append(count);
            }
        }

        //  check if new string is bigger than the original
        return newStr.length() > originalStr.length() ? originalStr : newStr.toString();

    }
}

