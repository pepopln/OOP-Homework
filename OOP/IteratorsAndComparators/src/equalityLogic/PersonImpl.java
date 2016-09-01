package equalityLogic;

import equalityLogic.interfaces.Person;

public class PersonImpl implements Person,Comparable<Person>{
    private String name;
    private  int age;

    public PersonImpl(String name, int age) {
        this.setName(name);
        this.setAge(age);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getAge() {
        return this.age;
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setAge(int age) {
        this.age = age;
    }

    @Override
    public int hashCode() {
        return this.getName().hashCode()+this.getAge()*7;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Person){
            return false;
        }
        Person other = (Person) obj;
        return this.getName().equals(other)&&this.getAge()==other.getAge();
    }

    @Override
    public int compareTo(Person o) {
        int result = this.getName().compareTo(o.getName());
        if (result==0){
            result=Integer.compare(this.getAge(),o.getAge());
        }
        return result;
    }
}
