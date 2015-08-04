package tree;

import java.util.Arrays;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: shraddha
 * Date: 3/10/15
 * Time: 4:00 PM
 * To change this template use File | Settings | File Templates.
 */
public class TreeTransform {
    public static void main(String[] args) {
        List<Integer> a = Arrays.asList(4, 2, 3, 5, 19, 20, 1, 56);
        TreeNode root = Tree.createTreeFromArray(a, true);
//        Tree.printLevelOrder(root);
//        System.out.println("NEW");
//        transform2Tree(root);
//        Tree.printLevelOrder(root);
        Tree.printinOrderKthElement(root, 6);
    }
    public static void transformTree(TreeNode root) {
        if (root == null ) {
            return;
        }

//        root.setData(root.getData() + getSum(root.getRight()));

        transformTree(root.getLeft());
        transformTree(root.getRight());

        root.setData(root.getData() + ((root.getRight()!=null) ? root.getRight().getData() : 0 )+ getLeftSum(root.getRight()));

    }

    public static int transform2Tree(TreeNode root) {
        if (root == null) {
            return 0;
        }

//        root.setData(root.getData() + getSum(root.getRight()));
        int rightVal = transform2Tree(root.getRight());
        root.setData(root.getData() + rightVal);
        int leftVal = transform2Tree(root.getLeft());
        return leftVal + root.getData();

    }

    private static int getLeftSum(TreeNode node) {
        int sum = 0;
        while (node!=null) {
            if (node.getLeft() != null)
                sum += node.getLeft().getData();
            node = node.getLeft();
        }

        return sum;
    }

    public static int getSum(TreeNode root) {
        if (root == null) {
            return 0;
        }

        return root.getData() + getSum(root.getLeft()) + getSum(root.getRight());

    }}
