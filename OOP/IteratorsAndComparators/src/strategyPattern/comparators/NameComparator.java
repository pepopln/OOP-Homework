package strategyPattern.comparators;



import strategyPattern.interfaces.Person;

import java.util.Comparator;

public class NameComparator implements Comparator<Person>{

    @Override
    public int compare(Person o1, Person o2) {
        int nameLengthCompare = Integer.compare(o1.getName().length(),
                o2.getName().length());
        int firstLetterCompare = Character.compare(o1.getName().toLowerCase().charAt(0),
                o2.getName().toLowerCase().charAt(0));

        if (nameLengthCompare==0){

            return firstLetterCompare;
        }else {
            return nameLengthCompare;
        }

    }
}
