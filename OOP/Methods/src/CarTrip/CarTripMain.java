package CarTrip;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CarTripMain {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] params = reader.readLine().split("\\s+");
        Double speed = Double.parseDouble(params[0]);
        Double fuel = Double.parseDouble(params[1]);
        Double fuelEconomy = Double.parseDouble(params[2]);
        Car car = new Car(speed,fuel,fuelEconomy);
        while (true){
            String[] command = reader.readLine().trim().split("\\s+");
            if (command[0].equals("END")){
                break;
            }
            switch (command[0]){
                case "Travel":
                    double distance =Double.parseDouble(command[1]);
                    car.travel(distance);
                    break;
                case "Refuel":
                    double litters=Double.parseDouble(command[1]);
                    car.refuel(litters);
                    break;
                case  "Distance":
                double traveledDistance = car.getTotalDistance();
                System.out.printf("Total distance: %s kilometers%n", traveledDistance);
                break;
                case "Time":
                    double spendTime = car.getTotalTime();
                    int hours = (int)spendTime/60;
                    int minutes = (int)spendTime%60;
                    System.out.printf("Total time: %d hours and %d minutes%n",hours,minutes);
                    break;
                case "Fuel":
                    double fuelLeft = car.getFuelAmount();
                    System.out.printf("Fuel left: %s liters%n",fuelLeft);
                    break;
            }
        }

    }
}
