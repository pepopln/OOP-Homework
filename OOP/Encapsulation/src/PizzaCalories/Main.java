package PizzaCalories;


import PizzaCalories.models.Dough;
import PizzaCalories.models.Pizza;
import PizzaCalories.models.Topping;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


    static BufferedReader reader;

    public static void main(String[] args) throws IOException {
        reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            while (true) {
                String[] params = reader.readLine().split("\\s+");
                if (params[0].equals("END")) {
                    break;
                }
                String result = null;

                switch (params[0]) {
                    case "Dough":
                        Dough dough = tryMakeDough(params);
                        result = String.format("%.2f", dough.getCalories());
                        break;
                    case "Topping":
                        Topping topping = tryMakeTopping(params);
                        result = String.format("%.2f", topping.getCalories());
                        break;


                    case "Pizza":
                        Pizza pizza = tryMakePizza(params);
                        result = pizza.toString();
                        break;
                }
                System.out.println(result);
            }
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private static Pizza tryMakePizza(String[] params) throws IOException {
        String name = params[1];
        int toppingsCount = Integer.valueOf(params[2]);
        Pizza pizza = new Pizza(name, toppingsCount);
        String[] line = reader.readLine().split("\\s+");
        Dough dough = tryMakeDough(line);
        pizza.setDough(dough);
        for (int i = 0; i < toppingsCount; i++) {
            String[] toppInput = reader.readLine().split("\\s+");
            Topping topping = tryMakeTopping(toppInput);
            pizza.addTopping(topping);
        }
        return pizza;

    }

    private static Topping tryMakeTopping(String[] params) {
        String type = params[1];
        int weight = Integer.valueOf(params[2]);
        Topping topping = new Topping(type, weight);
        return topping;

    }


    private static Dough tryMakeDough(String[] params) {
        String flourType = params[1];
        String bakingTechnique = params[2];
        int weight = Integer.valueOf(params[3]);
        Dough dough = new Dough(flourType, bakingTechnique, weight);
        return dough;

    }

}
