package equalityLogic.interfaces;

public interface Person extends Comparable<Person> {

    String getName();
    int getAge();
}
