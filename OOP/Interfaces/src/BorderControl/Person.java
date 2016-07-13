package BorderControl;


public class Person implements Checker {
String name;
    String age;
    String id;

    public Person(String name, String age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }
    @Override
    public String getId() {
        return id;
    }
}
