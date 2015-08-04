package linkedlist;

/**
 * Created with IntelliJ IDEA.
 * User: shraddha
 * Date: 4/5/15
 * Time: 10:11 AM
 * To change this template use File | Settings | File Templates.
 */
public class CreateLinkedList {
    public static void main(String[] args) {
        int[] a = new int[]{1,2,3,4,5};
        LinkedListNode head = createLinkedList(a);
        int ab = 2;
    }

    public static LinkedListNode createLinkedList(int a[]) {
        LinkedListNode prev = null;
        LinkedListNode head = null;
        for (int i=0; i<a.length; i++) {
            LinkedListNode node = new LinkedListNode(a[i]);
            if (prev != null) {
                prev.setNext(node);
            }
            prev = node;
            if (i==0) {
                head = node;
            }
        }
        return head;
    }

    public static void printLinkedList(LinkedListNode head) {
        while(head!=null) {
            System.out.print( head.getData() + " -> ");
            head = head.getNext();
        }
    }

    public static int getSize(LinkedListNode newhead) {
        int count =0;
        while(newhead!=null) {
            count+=1;
            newhead = newhead.getNext();
        }
        System.out.println("Linked list size is: " + count);
        return count;
    }
}
