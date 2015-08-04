package linkedlist;

/**
 * Created with IntelliJ IDEA.
 * User: shraddha
 * Date: 7/26/15
 * Time: 10:41 PM
 * To change this template use File | Settings | File Templates.
 */
public class ReverseLL {
    public static void main(String[] args) {
        int[] a = new int[]{1,2,3,4,5,6,7,8,9};
        LinkedListNode head = CreateLinkedList.createLinkedList(a);
        CreateLinkedList.printLinkedList(head);
        head = reverseLLrecursive(head, null);
        CreateLinkedList.printLinkedList(head);
    }

    public static LinkedListNode reverseLLrecursive(LinkedListNode head, LinkedListNode end) {
        if(head.getNext() == end) {
            return head;
        } else {
            LinkedListNode headNode = reverseLLrecursive(head.getNext(), end);
            head.getNext().setNext(head);
            head.setNext(null);
            return headNode;
        }
    }

}
