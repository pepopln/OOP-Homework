package WildFarm.Animal.Mamal;


import WildFarm.Animal.Animal;

import java.text.DecimalFormat;

public abstract class Mamal extends Animal {
public String livingRegion;

    public Mamal(String animalName, Double animalWeight,  String livingRegion) {
        super(animalName, animalWeight);
        this.livingRegion=livingRegion;
    }
    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("0.####");
        //{AnimalType} [{AnimalName}, {CatBreed}, {AnimalWeight}, {AnimalLivingRegion}, {FoodEaten}]
        return String.format("%s[%s, %s, %s, %s]",
                this.getClass().getSimpleName(),
                this.animalName,
                df.format(this.animalWeight),
                this.livingRegion,
                this.foodEaten);
    }
}
