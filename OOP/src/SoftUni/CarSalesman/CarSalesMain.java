package SoftUni.CarSalesman;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;



public class CarSalesMain {
    public static void main(String[] args) throws IOException {

        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(reader.readLine());
        HashMap<String,Engine> engines=new HashMap<>();
        for (int i = 0; i < n; i++) {
            String[] input = reader.readLine().split("\\s+");
            String model = input[0];
            int power = Integer.valueOf(input[1]);
            Engine engine = new Engine(model,power);
            if (input.length>2){
                if (isNumber(input[2])){
                    int displacement = Integer.valueOf(input[2]);
                    engine.setDisplacement(displacement);
                }else {
                    String efficiency=input[2];
                    engine.setEfficiency(efficiency);
                }
            }
            if (input.length>3){
                if (isNumber(input[3])){
                    int displacement = Integer.valueOf(input[3]);
                    engine.setDisplacement(displacement);
                }else {
                    String efficiency = input[3];
                    engine.setEfficiency(efficiency);
                }
            }
            engines.put(model,engine);
        }
        int m = Integer.valueOf(reader.readLine());
        List<Car> cars = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            String[] input = reader.readLine().split("\\s+");
            String model = input[0];
            String engineModel = input[1];
            Engine engine = engines.get(engineModel);
            Car car = new Car(model,engine);
            if (input.length>2){
                if (isNumber(input[2])){
                    int weight = Integer.valueOf(input[2]);
                    car.setWeight(weight);
                }else {
                    String color = input[2];
                    car.setColor(color);
                }
            }
            if (input.length>3){
                if (isNumber(input[3])){
                    int weight=Integer.valueOf(input[3]);
                    car.setWeight(weight);
                }else {
                    String color = input[3];
                    car.setColor(color);
                }
            }
            cars.add(car);
        }
        for (Car car : cars) {
            System.out.println(car);
        }
    }

    private static boolean isNumber(String s) {
        try {
            Integer.parseInt(s);
            return true;
        }catch (NumberFormatException ex) {
            return false;
        }
    }
}
