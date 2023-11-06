package data_structures;

import java.util.Iterator;

public class ListADT<E> implements Iterable<E> {

    private Node<E> head;
    private Node<E> tail;
    private int size;

    // constructors
    public ListADT() {
        head = null;
        tail = null;
        size = 0;
    }

    public Node<E> getHead() {
        return head;
    }

    public void setHead(Node<E> head) {
        this.head = head;
    }
    
    public Node<E> getTail() {
        return tail;
    }

    public void setTail(Node<E> tail) {
        this.tail = tail;
    }

    // get size of list
    public int getSize() {
        return size;
    }

    // add to end of list
    public void add(Node<E> node) {
        if (isEmpty()) {
            head = node;
            tail = node;
        } else {
            tail.setNext(node);
            tail = node;
        }
        size++;
    }

    // add all elements from another list
    public void addAll(ListADT<E> list) {
        Node<E> current = list.getHead();
        for (int i = 0; i < list.getSize(); i++) {
            add(current);
            current = current.getNext();
        }
    }

    // insert node at index
    public void insert(int index, Node<E> node) {
        Node<E> current = head;
        for (int i = 1; i < index; i++) {
            current = current.getNext();
        }
        Node<E> temp = current.getNext();
        node.setNext(temp);
        current.setNext(node);
        size++;
    }
    
    // get element at index
    public E get(int index) {
        if (index < 0 || index >= size) { // check for out of bounds
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        Node<E> current = head;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        return current.getData();
    }

    // set element at index
    public void set(int index, E data) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        Node<E> current = head;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        current.setData(data);
    }

    // remove last element
    public void remove() {
        Node<E> current = head;
        for (int i = 0; i < size - 1; i++) {
            current = current.getNext();
        }
        current.setNext(null);
        tail = current;
        size--;
    }
    
    // remove at index
    public void remove(int index) {
        Node<E> current = head; 
        for (int i = 0; i < index - 1; i++) {
            current = current.getNext();
        }
       var temp = current.getNext().getNext();
       current.setNext(temp);
       size--;
    }
    
    // convert list to array
    public Object[] toArray() {
        Object[] array = new Object[size];
        Node<E> current = head;
        for (int i = 0; i < size; i++) {
            array[i] = current.getData();
            current = current.getNext();
        }
        return array;
    }

    // clear list
    public void clear() {
        head = null;
        size = 0;
    }

    // logic for checking if list is empty
    public boolean isEmpty() {
        return head == null;
    }

    // iterator
    @Override
    public Iterator<E> iterator() {
        return new LinkedListIterator<E>(this);
    }

    // toString method
    @Override
    public String toString() {
        String nodeList = "";
        Node<E> node = head;
        for (int i = 0; i < size; i++) {
            nodeList += node;
            nodeList += '\n';
            node = node.getNext();
        }
        return nodeList;
    }
}
