package genericBox;


import genericBox.interfaces.CustomList;

import java.util.*;

public class CustomListImpl<T extends Comparable<T>> implements CustomList<T> {
    private List<T> elements;

    public CustomListImpl() {
        this.elements=new LinkedList<T>();
    }

    @Override
    public void add(T element) {
        this.elements.add(element);
    }



    @Override
    public T remove(int index) {
        return this.elements.remove(index);
    }

    @Override
    public boolean contains(T element) {
        return this.elements.contains(element);
    }

    @Override
    public void swap(int indexOne, int indexTwo) {
        Collections.swap(this.elements,indexOne,indexTwo);
    }

    @Override
    public int countGreaterThat(T element) {
        int count = 0;
        for (T t : elements) {
            if (t.compareTo(element)>0){
                count++;
            }
        }
        return count;
    }

    @Override
    public T getMax() {
        return this.elements.stream().max(new Comparator<T>() {
            @Override
            public int compare(T o1, T o2) {
                return o1.compareTo(o2);
            }
        }).get();
    }

    @Override
    public T getMin() {
        T minElement = this.elements.get(0);
        for (int i = 0; i < this.elements.size(); i++) {
            if (this.elements.get(i).compareTo(minElement)<0){
                minElement=this.elements.get(i);
            }

        }
        return minElement;
    }

    @Override
    public int getSize() {
        return this.elements.size();
    }

    @Override
    public T getElement(int index) {
        return this.elements.get(index);
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();
        for (T element : elements) {
            output.append(element).append(System.lineSeparator());
        }
     return output.toString();
    }

    @Override
    public Iterator<T> iterator() {

        Iterator<T> iterator = new Iterator<T>() {
            int index=0;
            @Override
            public boolean hasNext() {
                if (index<elements.size()) {
                    return true;
                }
                return false;
            }


            @Override
            public T next() {
                return elements.get(index++);
            }
        };
        return iterator;
    }
}