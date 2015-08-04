package linkedlist;

/**
 * Created with IntelliJ IDEA.
 * User: shraddha
 * Date: 8/4/15
 * Time: 1:41 PM
 * To change this template use File | Settings | File Templates.
 */

/**
 * Check if a singly linked list is a palindrome
 * 1->2->3->4->3->2->1
 * Code not working for linked list of size 1
 */
public class LinkedListPalindrome {
    public static void main(String[] args) {
        int[] a = new int[]{1, 1};
        LinkedListNode head = CreateLinkedList.createLinkedList(a);
        System.out.println("Is the linked list a palindrom? : " + isLinkedListPalindrome(head));

    }

    private static boolean isLinkedListPalindrome(LinkedListNode head) {
        if(head==null) {
            return true;
        }

        // go to the middle elemenet of the list
        LinkedListNode mid = getMiddleElement(head);
        if (mid == null) {
            return false;
        }

        // reverse the first half of the linked list
        LinkedListNode newhead = ReverseLL.reverseLLrecursive(head, mid);
        head.setNext(mid);

        CreateLinkedList.printLinkedList(newhead);

        if(CreateLinkedList.getSize(newhead) %2 !=0) {
            mid = mid.getNext();
        }

        return isPalindrome(newhead, mid);

    }

    private static boolean isPalindrome(LinkedListNode newhead, LinkedListNode mid) {
        while(newhead!=mid && mid != null) {
            if (newhead.getData()!= mid.getData()) {
                return false;
            }
            newhead = newhead.getNext();
            mid = mid.getNext();
        }
        return true;
    }

    private static LinkedListNode getMiddleElement(LinkedListNode head) {
        if (head == null) {
            return null;
        }
        LinkedListNode slow = head;
        LinkedListNode fast = head;

        while(slow.getNext() !=null && fast != null && fast.getNext() != null) {
            slow = slow.getNext();
            if (fast.getNext() != null) {
                fast = fast.getNext().getNext();
            }
        }

        System.out.println("Returning middle element: " + slow.getData());
        return slow;
    }


}
