package data_structures;

public class DLL<E> {

    private int size;
    private DNode<E> head;
    private DNode<E> tail;

    // constructors
    public DLL() {
        head = null;
        tail = null;
        size = 0;
    }
    
    public DNode<E> getHead() {
        return head;
    }

    public void setHead(DNode<E> head) {
        this.head = head;
    }

    public DNode<E> getTail() {
        return tail;
    }

    public void setTail(DNode<E> tail) {
        this.tail = tail;
    }

    public int getSize() {
        return size;
    }
    
    // add to list
    public void add(DNode<E> node) {
        if (isEmpty()) {
            head = node;
            tail = node;
        } else {
            tail.setNext(node);
            node.setPrev(tail);
            tail = node;
        }
        size++;
    }

    // add to beginning of list
    public void addFirst(E data) {
        DNode<E> node = new DNode<E>(data);
        if (isEmpty()) {
            head = node;
            tail = node;
        } else {
            node.setNext(head);
            head.setPrev(node);
            head = node;
        }
        size++;
    }

    // add to end of list
    public void addLast(E data) {
        DNode<E> node = new DNode<>(data);
        if (isEmpty()) {
            head = node;
            tail = node;
        } else {
            tail.setNext(node);
            node.setPrev(tail);
            tail = node;
        }
        size++;
    }

    // add all elements from another list
    public void addAll(ListADT<? extends E> list) {
        for (E data : list) {
            addLast(data);
        }
    }

    // remove first element from list
    public E removeFirst() {
        if (isEmpty()) {
            return null;
        }
        DNode<E> temp = head;
        head = head.getNext();
        if (head != null) {
            head.setPrev(null);
        } else {
            tail = null;
        }
        size--;
        return temp.getData();
    }
    
    // remove last element from list
    public E removeLast() {
        if (isEmpty()) {
            return null;
        }
        DNode<E> temp = tail;
        tail = tail.getPrev();
        if (tail != null) {
            tail.setNext(null);
        } else {
            head = null;
        }
        size--;
        return temp.getData();
    }

    // logic for checking if list is empty
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public String toString() {
        String dNodeList = "";
        DNode<E> node = head;
        for (int i = 0; i < size; i++) {
            dNodeList += node.toString()+'\n';
            node = node.getNext();
        }
        return dNodeList;
    }
}
