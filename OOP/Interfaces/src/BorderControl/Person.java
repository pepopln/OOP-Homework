package BorderControl;


public class Person implements Checker,Birthable {
private String name;
    private String age;
    private String id;
    private String birthDate;

    public Person(String name, String age, String id, String birthDate) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    @Override
    public String getBirthdate() {
        return this.birthDate;
    }

    @Override
    public String getId() {
        return id;
    }
}

