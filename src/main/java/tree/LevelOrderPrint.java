package tree;

import java.util.Arrays;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: shraddha
 * Date: 3/9/15
 * Time: 10:16 AM
 * To change this template use File | Settings | File Templates.
 */
public class LevelOrderPrint {
    public static void main(String[] args) {
        // create tree
        List<Integer> a = Arrays.asList(4, 5, 19, 20, 1, 56);
        TreeNode root = Tree.createTreeFromArray(a, true);
//        Tree.printinOrder(root);
        Tree.printLevelOrder(root);
    }

}
