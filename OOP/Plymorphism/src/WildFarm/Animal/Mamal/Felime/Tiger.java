package WildFarm.Animal.Mamal.Felime;


import WildFarm.Food.Food;
import WildFarm.Food.Vegetable;

public class Tiger extends Felime{
    String livingRegion;

    public Tiger(String animalName, Double animalWeight, String livingRegion) {
        super(animalName, animalWeight, livingRegion);
    }

    @Override
    public void eat(Food food) {
        if (food instanceof Vegetable){
            throw new IllegalArgumentException("Tigers are not eating that type of food!");
        }
        this.foodEaten+=food.getQuantity();
    }

    @Override
    public String makeSound() {
        return "ROAAR!!!";
    }
}
