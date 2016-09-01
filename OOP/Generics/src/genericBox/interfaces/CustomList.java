package genericBox.interfaces;

public interface CustomList<T extends Comparable<T>>extends Iterable<T> {


     void add(T element);

    T remove(int index);
    boolean contains(T element);
    void swap(int indexOne,int indexTwo);
    int countGreaterThat(T element);
    T getMax();
    T getMin();

    int getSize();
    T getElement(int index);
}
