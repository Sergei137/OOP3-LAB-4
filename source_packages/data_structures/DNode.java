package data_structures;

public class DNode<E> {

    private E data;
    private DNode<E> next;
    private DNode<E> prev;

    // constructors
    public DNode(E data) {
        this.data = data;
        prev = next = null;
    }
    
    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }

    public DNode<E> getNext() {
        return next;
    }

    public void setNext(DNode<E> next) {
        this.next = next;
    }

    public DNode<E> getPrev() {
        return prev;
    }

    public void setPrev(DNode<E> prev) {
        this.prev = prev;
    }

    // toString method
    @Override
    public String toString() {
        // return "DNode{" + "data=" + data + '}';
        return String.format("DNode {data = %s}", data);
    }
}
