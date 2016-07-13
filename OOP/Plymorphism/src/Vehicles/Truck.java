package Vehicles;


public class Truck extends Vehicle{

    public Truck(double fuelQuantity, double litersPerKm,double tankCapacity) {
        super(fuelQuantity, litersPerKm,tankCapacity);

    }
public String drive(double distance){
    double SUMMER_TRUCK_FUEL_INCREASE=1.6;
    return super.drive(distance,SUMMER_TRUCK_FUEL_INCREASE);
}
    @Override
    public void refuel(double fuel) {
        double REFUEL_CONSTANT =0.95;
        this.setFuelQuantity(this.getFuelQuantity()+(fuel*REFUEL_CONSTANT));
    }
}
