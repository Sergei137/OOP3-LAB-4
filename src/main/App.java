package main;

import java.util.ArrayList;

import data_structures.*;

public class App {
    public static void main(String[] args) {
        /*
        ListADT<Integer> list1 = new ListADT<>(); // create a new list
        
        Node<Integer> node = new Node<>(0); // create a new node
        list1.add(node); // add node to list

        // add new nodes to list
        list1.add(new Node<>(1)); 
        list1.add(new Node<>(2));
        list1.add(new Node<>(3));
        list1.add(new Node<>(4));

        System.out.println(list1.getHead());
        System.out.println(list1.getTail());

        list1.insert(2, new Node<>(5)); // insert node at index 2
        */

        // TESTING CODE
        ListADT<Integer> list2 = new ListADT<>(); // create a new list
        Node<Integer> node = new Node<>(0);
        list2.add(node);
        list2.add(new Node<>(1));
        list2.add(new Node<>(2));
        list2.add(new Node<>(3));
        list2.add(new Node<>(4));
        list2.add(new Node<>(5));
        System.out.println("* * * * * Printing the list after adding * * * * *");
        System.out.println(list2);
        list2.insert(2, new Node<>(100));
        System.out.println("* * * * * Printing the list after insertion * * * * *");
        System.out.println(list2);
        list2.remove();
        System.out.println("* * * * * Printing the list after removing * * * * *");
        System.out.println(list2);
        list2.remove(2);
        System.out.println("* * * * * Printing the list after removing at 2 * * * * *");
        System.out.println(list2);
        
        DLL<Object> dList = new DLL<>();
        dList.add(new DNode<>(0));
        dList.add(new DNode<>(1));
        dList.add(new DNode<>(2));
        dList.add(new DNode<>(3));
        dList.add(new DNode<>(4));
        dList.add(new DNode<>(5));
        System.out.println("* * * * * Printing the Doubly list * * * * *");
        System.out.println(dList);
        
        ListADT<Car> carList = new ListADT<>();
        carList.add(new Node<>(new Car(2020, 230, "Bmw")));
        carList.add(new Node<>(new Car(2020, 230, "Honda")));
        carList.add(new Node<>(new Car(2020, 230, "Kia")));
        System.out.println("* * * * * Printing the Car list * * * * *");
        System.out.println(carList);
        
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (var i: arrayList) {
            System.out.println(i);
        }
        
        var iter = new LinkedListIterator<>(list2);
        
        while(iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}
