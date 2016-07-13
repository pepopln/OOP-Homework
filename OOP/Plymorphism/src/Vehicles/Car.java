package Vehicles;


public class Car extends Vehicle {

    public Car(double fuelQuantity, double litersPerKm,double tankCapacity) {
        super(fuelQuantity, litersPerKm,tankCapacity);
    }

    public String drive(double distance) {
        double SUMMER_CAR_FUEL_INCREASE = 0.9;
        return super.drive(distance, SUMMER_CAR_FUEL_INCREASE);
    }
}



