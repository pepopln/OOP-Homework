package WildFarm.Animal.Mamal;

import WildFarm.Food.Food;
import WildFarm.Food.Meat;

public class Zebra extends Mamal{

    public Zebra(String animalName, Double animalWeight, String livingRegion) {
        super(animalName, animalWeight, livingRegion);
    }

    @Override
    public void eat(Food food) {
        if (food instanceof Meat){
            throw new IllegalArgumentException("Zebras are not eating that type of food!");
        }
        this.foodEaten=food.getQuantity();
    }

    @Override
    public String makeSound() {
        return "Zs";
    }
}
