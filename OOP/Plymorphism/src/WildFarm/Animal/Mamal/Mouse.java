package WildFarm.Animal.Mamal;


import WildFarm.Food.Food;
import WildFarm.Food.Meat;

public class Mouse extends Mamal {

    public Mouse(String animalName, Double animalWeight, String livingRegion) {
        super(animalName, animalWeight, livingRegion);
    }



    @Override
    public void eat(Food food) {
        if (food instanceof Meat){
            throw new IllegalArgumentException("Mouses are not eating that type of food!");
        }
        if (food.getQuantity()<=0){
            throw  new IllegalArgumentException("A cheese was just eaten!");
        }
        this.foodEaten+=food.getQuantity();
    }

    @Override
    public String makeSound() {
        return "SQUEEEAAAK!";
    }
}
