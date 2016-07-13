package Family;

import Family.Family;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Method;


public class Main {

    public static void main(String[] args) throws ClassNotFoundException, IOException, NoSuchMethodException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Family family = new Family();
        int n = Integer.valueOf(reader.readLine());
        for (int i = 0; i < n; i++) {

            String[] dataPerson = reader.readLine().split("\\s+");
            String name = dataPerson[0];
            int age = Integer.parseInt(dataPerson[1]);
        family.addFamilyMember(new Person(name,age));
        }
        System.out.println(family.getOldestMember());
        Method getOldestMethod = Class.forName("Family").getMethod("getOldestMember");
        Method addMemberMethod =Class.forName("Family").getMethod("addFamilyMember", Person.class);

    }
}
