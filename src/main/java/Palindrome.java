/**
 * Created with IntelliJ IDEA.
 * User: shraddha
 * Date: 2/24/15
 * Time: 10:53 PM
 * To change this template use File | Settings | File Templates.
 */
public class Palindrome {

    public static boolean isPalindrome(String testStr) {
        int n = testStr.length()-1;
        for(int i=0; i<=n/2; i++ ) {
            char a = testStr.charAt(i);
            char b = testStr.charAt(n-i);
            if (a != b) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "abcba";
        System.out.println("The string: " + str + " : " + isPalindrome(str));
    }

}
