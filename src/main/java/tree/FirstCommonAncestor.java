package tree;

import java.util.Arrays;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: shraddha
 * Date: 3/12/15
 * Time: 11:52 PM
 * To change this template use File | Settings | File Templates.
 */
public class FirstCommonAncestor {
    public static void main(String[] args) {
        List<Integer> a = Arrays.asList(1,2,3,4,5,6,7);
        TreeNode root = Tree.createTreeFromArray(a, true);
        System.out.println(findCommonAncestor2(root, 5,7));
        System.out.println(findCommonAncestor2(root, 5,12)); // error there is no 12 in the tree, still returns 5 as ancestor
    }


    /**
     * Basic idea is to recurse through both halves looking for ancestor
     * When a node is same as one of a or b, return that node
     * If left and right results are non -1, this is the ancestor
     * If one of them is -1, the other one is the answer
     */
    private static int findCommonAncestor2(TreeNode root, int a, int b) {
        if (root == null) {
            return -1;
        }

        if (root.getData() == a || root.getData() == b) {
            return root.getData();
        }

        int left = findCommonAncestor2(root.getLeft(), a, b);
        int right = findCommonAncestor2(root.getRight(), a, b);

        if (left !=-1 && right !=-1) {
            return root.getData();
        }

        return left !=-1 ? left : right != -1 ? right : -1;
    }
}
