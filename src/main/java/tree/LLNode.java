package tree;

/**
 * Created with IntelliJ IDEA.
 * User: shraddha
 * Date: 3/24/15
 * Time: 10:23 AM
 * To change this template use File | Settings | File Templates.
 */
public class LLNode {
    private int data;
    private LLNode prev;
    private LLNode next;

    public LLNode(int data) {
        this.data = data;
    }

    public LLNode getPrev() {
        return prev;
    }

    public void setPrev(LLNode prev) {
        this.prev = prev;
    }

    public LLNode getNext() {
        return next;
    }

    public void setNext(LLNode next) {
        this.next = next;
    }

    public int getData() {
        return data;
    }
}


