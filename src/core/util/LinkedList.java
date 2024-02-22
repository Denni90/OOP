package core.util;

public interface LinkedList<T> {
    void addFirst(T elem);
    void addLast(T elem);
    int size();
    T getElementByIndex(int counter);
}