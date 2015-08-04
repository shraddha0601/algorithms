package bitwise;

/**
 * Created with IntelliJ IDEA.
 * User: shraddha
 * Date: 3/29/15
 * Time: 4:27 PM
 * To change this template use File | Settings | File Templates.
 */
public class BitTest {
    public static void main(String[] args) {
        int i = 14;
        System.out.println(Integer.toBinaryString(i));
        System.out.println(Integer.toBinaryString(i>>1));
        System.out.println(Integer.toBinaryString(i>>>1));


    }
}
