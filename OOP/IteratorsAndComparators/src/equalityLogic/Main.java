package equalityLogic;

import equalityLogic.interfaces.Person;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        TreeSet<Person> peopleTreeSet = new TreeSet<>();
        HashSet<Person> peopleHashSet = new HashSet<>();
        int numberOfLines = Integer.parseInt(reader.readLine());
        for (int i = 0; i < numberOfLines; i++) {
            String[] personInfo = reader.readLine().split("\\s+");
            String name = personInfo[0];
            int age = Integer.parseInt(personInfo[1]);
            Person person= new PersonImpl(name,age);

            peopleTreeSet.add(person);
            peopleHashSet.add(person);

        }
        System.out.println(peopleTreeSet.size());
        System.out.println(peopleHashSet.size());
    }

}
