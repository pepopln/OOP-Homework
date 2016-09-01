package Pr01ListyIterator;

import java.util.Iterator;
import java.util.List;

public class ListyIteratorImpl<E> implements ListyIterator<E>,Iterable<E>{

    private List<E> internalList;
    private int index;

    public ListyIteratorImpl(List<E> internalList) {
        this.setInternalList(internalList);
        this.index=0;
    }

    public List<E> getInternalList() {
        return this.internalList;
    }

    private void setInternalList(List<E> internalList) {
        this.internalList = internalList;
    }

    @Override
    public boolean listyHasNext() {
        return this.getSize()>this.index+1;
    }

    @Override
    public void printAll() {
        for (E e : this.internalList) {
            System.out.print(e+" ");
        }
        System.out.println();
    }


    @Override
    public boolean move() {
        if (this.index+1<this.getSize()){
            this.index++;
            return true;
        }
            return false;

    }

    @Override
    public int getSize() {
        return this.internalList.size();
    }

    @Override
    public void print() {
        System.out.println(this.internalList.get(this.index));
    }



//    @Override
//    public void printAll() {
//
//    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            int currentIndex =0;
            @Override
            public boolean hasNext() {
                return getInternalList().get(currentIndex)!=null;
            }

            @Override
            public E next() {
                return getInternalList().get(currentIndex++);
            }
        };
    }
}
