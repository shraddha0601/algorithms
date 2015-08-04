package tree;

import java.util.Arrays;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: shraddha
 * Date: 3/9/15
 * Time: 9:54 PM
 * To change this template use File | Settings | File Templates.
 */
public class IsBST {
    public static void main(String[] args) {
        List<Integer> a = Arrays.asList(10, 15, 30, 25, 17, 30, -32);
        TreeNode root = Tree.createTreeFromArray(a, false);
        System.out.println("Is tree balanced: " + isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE));
    }

    private static boolean isBST(TreeNode root, int minValue, int maxValue) {
        if (root == null) {
            return true;
        }

        if (root.getData() < minValue || root.getData() > maxValue) {
            return false;
        }
        return isBST(root.getLeft(), minValue, root.getData()) && isBST(root.getRight(), root.getData(), maxValue);
    }
}
