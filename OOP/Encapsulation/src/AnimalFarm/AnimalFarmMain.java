package AnimalFarm;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AnimalFarmMain {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        int age = Integer.valueOf(reader.readLine());
        try {
            Chicken chicken = new Chicken(name, age);
            System.out.printf("Chicken %s (age %d) can produce %.0f eggs per day.",
                    chicken.getName(),
                    chicken.getAge(),
                    chicken.getProductPerDay());
        } catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
        }
    }
}
