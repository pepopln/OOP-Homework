package strategyPattern.models;


import strategyPattern.interfaces.Person;

public class PersonImpl implements Person{

    private String personName;
    private Integer personAge;

    public PersonImpl(String name, int age) {
        this.setPersonName(name);
        this.setPersonAge(age);
    }

    @Override
    public String getName() {
        return this.personName;
    }

    @Override
    public Integer getAge() {
        return this.personAge;
    }

    private void setPersonName(String name) {
        this.personName = name;
    }

    private void setPersonAge(Integer age) {
        this.personAge = age;
    }

    @Override
    public String toString() {
        return this.getName()+" "+this.getAge();
    }
}
