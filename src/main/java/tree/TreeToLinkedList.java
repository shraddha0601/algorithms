package tree;

import java.util.Arrays;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: shraddha
 * Date: 3/24/15
 * Time: 10:24 AM
 * To change this template use File | Settings | File Templates.
 */
public class TreeToLinkedList {

    private static LLNode prev;

    public static void main(String[] args) {
        List<Integer> a = Arrays.asList(4, 2, 3, 5, 19, 20, 1, 56);
        TreeNode root = Tree.createTreeFromArray(a, true);
        LLNode[] head = new LLNode[1];
        convertTreeToLinkedList(root, head);
//        convertTreeToLinkedListWithStatic(root, head);
        printLinkedList(head[0]);
    }

    private static void printLinkedList(LLNode head) {
        while(head!=null) {
            System.out.println(head.getData());
            head = head.getNext();
        }
    }

    private static LLNode convertTreeToLinkedList(TreeNode root, LLNode[] head) {
        if (root == null) {
            return null;
        }
        LLNode leftNode = convertTreeToLinkedList(root.getLeft(), head);
        LLNode node = new LLNode(root.getData());
        if (head[0] == null) {
            head[0] = node;
        }
        if (leftNode != null) {
            while(leftNode.getNext() != null) {
                leftNode = leftNode.getNext();
            }
            leftNode.setNext(node);
            node.setPrev(leftNode);
        }

        LLNode rightNode = convertTreeToLinkedList(root.getRight(), head);
        if (rightNode != null) {
            while (rightNode.getPrev() != null) {
                rightNode = rightNode.getPrev();
            }
        }
        node.setNext(rightNode);
        return node;
    }

    private static void convertTreeToLinkedListWithStatic(TreeNode root, LLNode[] head) {
        if (root == null) {
            return;
        }
        convertTreeToLinkedListWithStatic(root.getLeft(), head);
        LLNode node = new LLNode(root.getData());
        if (head[0] == null) {
            head[0] = node;
        }
        if (prev != null) {
            node.setPrev(prev);
            prev.setNext(node);
        }
        prev = node;
        convertTreeToLinkedListWithStatic(root.getRight(), head);
    }
}
