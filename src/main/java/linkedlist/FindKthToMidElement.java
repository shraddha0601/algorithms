package linkedlist;

/**
 * Created with IntelliJ IDEA.
 * User: shraddha
 * Date: 4/5/15
 * Time: 10:10 AM
 * To change this template use File | Settings | File Templates.
 */
public class FindKthToMidElement {
    public static void main(String[] args) {
        int[] a = new int[]{1,2,3,4,5,6,7,8,9};
        LinkedListNode head = CreateLinkedList.createLinkedList(a);
        System.out.println("K th to mid element is:" + kthToMidElement(head, 4) );
    }

    private static int kthToMidElement(LinkedListNode head, int n) {
        LinkedListNode fast = head;
        LinkedListNode k = head;

        for (int i=0; i<n; i++) {
            fast = fast.getNext().getNext();
        }

        while(fast != null && fast.getNext()!=null) {
            k = k.getNext();
            fast = fast.getNext().getNext();
        }

        return k.getData();
    }
}
