package WildFarm.Animal;


import WildFarm.FoodEdible;
import WildFarm.SoundProducible;

public abstract class Animal implements FoodEdible, SoundProducible {
public String animalName;

    public Double animalWeight;
    public Integer foodEaten;

    public Animal(String animalName,
                  Double animalWeight) {
        this.animalName = animalName;

        this.animalWeight = animalWeight;
        this.foodEaten = 0;
    }




}
