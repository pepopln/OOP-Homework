package Froggy;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class Lake implements Iterable<Integer> {
private List<Integer> elements;

    public Lake(Integer... elements) {
        this.elements = Arrays.asList(elements);
    }

    @Override
    public Iterator<Integer> iterator() {
        return new FrogIterator();
    }
    private class FrogIterator implements Iterator<Integer>{
        private int index;
        private boolean isEven;
        @Override
        public boolean hasNext() {
            if (index>=elements.size()&& !isEven){
                index=1;
                isEven=true;
            }
            return index<elements.size();
        }

        @Override
        public Integer next() {
            if (this.hasNext()){
                Integer element = elements.get(index);
                this.index+=2;
                return  element;

            }
           throw new NoSuchElementException();
        }
    }
}
