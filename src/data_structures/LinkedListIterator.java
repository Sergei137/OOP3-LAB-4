package data_structures;

import java.util.Iterator;

public class LinkedListIterator<E> implements Iterator<E> {
    
    private ListADT<E> list;
    private Node<E> current;

    // constructor
    public LinkedListIterator(ListADT<E> list) {
        this.list = list;
        this.current = list.getHead();
    }
    
    @Override
    public boolean hasNext() {
        return current.hasNext();
    }

    @Override
    public E next() {
        current = current.getNext();
        return current.getData();
    }
}
