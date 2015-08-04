package tree;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created with IntelliJ IDEA.
 * User: shraddha
 * Date: 3/9/15
 * Time: 9:34 AM
 * To change this template use File | Settings | File Templates.
 */
public class Tree {
    public static int counter = 0;
    private TreeNode root;

    public TreeNode getRoot() {
        return root;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }

    public Tree(TreeNode root) {

        this.root = root;
    }

    public static TreeNode createTreeFromArray(List<Integer> a, boolean balances) {
        if (balances) {
            Collections.sort(a);
        }
        return createTree(a, 0, a.size()-1);
    }

    private static TreeNode createTree(List<Integer> a, int start, int end) {
        if (start<=end) {
            int mid = (start+end)/2;
            TreeNode n = new TreeNode(a.get(mid), null, null);
            n.setLeft(createTree(a,start,mid-1));
            n.setRight(createTree(a,mid+1,end));
            return n;
        }
        return null;
    }

    public static void printinOrder(TreeNode node) {
        if (node==null) {
            return;
        }
        printinOrder(node.getLeft());
        System.out.println("** " + node.getData() + " **");
        printinOrder(node.getRight());
    }

    public static void printinOrderKthElement(TreeNode node, int k) {
        if (node==null || k==counter) {
            return;
        }

        printinOrderKthElement(node.getLeft(), k);
        counter += 1;
        if (k==counter) {
            System.out.println("kth element: " + node.getData());
            return;
        }
        printinOrderKthElement(node.getRight(), k);
    }

    public static void printLevelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            System.out.println("** " + node.getData() + " **");
            if(node.getLeft() != null) {
                queue.add(node.getLeft());
            }
            if (node.getRight() != null) {
                queue.add(node.getRight());
            }
        }
    }
}
