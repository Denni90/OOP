package core;

import core.list.MyLinkedList;

import java.util.Iterator;


public class ListMain {
    public static void main(String... args) {
        MyLinkedList<Integer> myList = new MyLinkedList<>();
        myList.addFirst(1234);
        myList.addLast(2345);
        myList.addLast(88);
        myList.addLast(4567);
        myList.addLast(778);
        myList.addFirst(100);

        Iterator<Integer> iterator = ((MyLinkedList<Integer>) myList).descendingIterator();
        while (iterator.hasNext()){
        System.out.println(iterator.next());
        }
    }
}