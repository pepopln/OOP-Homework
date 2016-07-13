package WildFarm.Animal.Mamal.Felime;


import WildFarm.Food.Food;

import java.text.DecimalFormat;

public class Cat extends Felime{
String breed;

    private String getBreed() {
        return breed;
    }

    private void setBreed(String breed) {
        this.breed = breed;
    }

    public Cat(String animalName, Double animalWeight, String livingRegion, String breed) {
        super(animalName, animalWeight, livingRegion);
        this.breed=breed;

    }

    @Override
    public String toString() {
         DecimalFormat df = new DecimalFormat("0.######");
        return String.format("%s[%s, %s, %s, %s, %s]",
                this.getClass().getSimpleName(),
                this.animalName,
                this.breed,
                df.format(this.animalWeight),
                this.livingRegion,
                this.foodEaten);
    }

    @Override
    public void eat(Food food) {
        this.foodEaten+=food.getQuantity();
    }

    @Override
    public String makeSound() {
        return "Meowwww";
    }
}
