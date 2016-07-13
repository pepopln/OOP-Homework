package WildFarm;


import WildFarm.Animal.Animal;
import WildFarm.Animal.Mamal.Felime.Cat;
import WildFarm.Animal.Mamal.Felime.Tiger;
import WildFarm.Animal.Mamal.Mouse;
import WildFarm.Animal.Mamal.Zebra;
import WildFarm.Food.Food;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;

public class Main {

    public static void main(String[] args) throws Exception  {
        BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));


        while (true) {
            String[] data = reader.readLine().split("\\s+");
            if (data[0].equals("End")){
                break;
            }
            String animalType = data[0];
            String animalName = data[1];
            Double animalWeight = Double.valueOf(data[2]);

            String livingRegion = data[3];
            String[] inputFood = reader.readLine().split("\\s+");
            String foodType="WildFarm.Food."+inputFood[0];
            int quantity = Integer.valueOf(inputFood[1]);

            Class<?> clazz = Class.forName(foodType);
            Constructor<?> ctor = clazz.getConstructor(Integer.class);
            Food food =(Food) ctor.newInstance(quantity);
            Animal animal=null;
            switch (animalType){
                case "Cat":
                    String breed = data[4];
                    animal=new Cat(animalName,animalWeight,livingRegion,breed);
                    break;
                case "Mouse":
                    animal = new Mouse(animalName,animalWeight,livingRegion);
                    break;
                case "Tiger":
                    animal = new Tiger(animalName,animalWeight,livingRegion);
                    break;
                case "Zebra":
                    animal=new Zebra(animalName,animalWeight,livingRegion);
                    break;
            }
            if (animal!=null){
                System.out.println(animal.makeSound());
                try {
                    animal.eat(food);
                }catch (IllegalArgumentException ex){
                    System.out.println(ex.getMessage());
                }
                System.out.println(animal);
            }

        }

    }
}
