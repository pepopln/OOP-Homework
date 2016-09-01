package genericBox;

import genericBox.interfaces.CustomList;
import genericBox.interfaces.Sorter;

public class SorterImpl<T extends Comparable<T>>implements Sorter<T> {

    @Override
    public void sort(CustomList<T> elements) {
        for (int i = 0; i < elements.getSize(); i++) {
            T currentElement = elements.getElement(i);
            for (int j = i+1; j < elements.getSize(); j++) {

                if (currentElement.compareTo(elements.getElement(j))>0){
                    elements.swap(i,j);
                }
            }

        }
    }
}
