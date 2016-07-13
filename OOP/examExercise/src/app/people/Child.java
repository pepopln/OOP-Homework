package app.people;

import app.items.Toy;

import java.util.List;


public class Child {
  private   List<Toy> toys;
   private double foodCost;
    private double toyCost;

    private Child(double foodCost,List<Toy> toys) {
        this.toys=toys;
        this.foodCost = foodCost;
           }
    public double getCost(){
        return this.foodCost+this.toyCost;

    }
    private void calculateToysCost(){
        this.toyCost=toys.stream()
                .mapToDouble((Toy t) ->t.getCost())
                .sum();

    }
}
