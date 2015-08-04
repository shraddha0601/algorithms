package linkedlist;

/**
 * Created with IntelliJ IDEA.
 * User: shraddha
 * Date: 4/5/15
 * Time: 10:09 AM
 * To change this template use File | Settings | File Templates.
 */
public class LinkedListNode {
    private int data;
    private LinkedListNode next;

    public LinkedListNode(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public LinkedListNode getNext() {
        return next;
    }

    public void setNext(LinkedListNode next) {
        this.next = next;
    }
}
