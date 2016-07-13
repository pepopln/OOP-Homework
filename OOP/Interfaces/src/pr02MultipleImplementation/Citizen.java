package pr02MultipleImplementation;


import pr02MultipleImplementation.contracts.Birthable;
import pr02MultipleImplementation.contracts.Identifiable;
import pr02MultipleImplementation.contracts.Person;

public class Citizen implements Person,Birthable,Identifiable {

    String name;
    int age;
    String id;
    String birthdate;

    public  Citizen(String name, int age, String id, String birthdate) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.birthdate = birthdate;
    }


    public String getName() {
        return name;
    }


    public int getAge() {
        return age;
    }

    public String getId() {
        return id;
    }

    public String getBirthdate() {
        return birthdate;
    }
}
