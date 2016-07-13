package Family;

import java.util.ArrayList;
import java.util.List;

public class Family {
private List<Person> persons;

    public Family() {
        this.persons =new ArrayList<>();
    }
    public void addFamilyMember(Person person){
        this.persons.add(person);
    }

    public Person getOldestMember(){
return this.persons.stream().sorted((n1,n2)->Integer.compare(n2.getAge(),n1.getAge())).findFirst().get();
}


    }


