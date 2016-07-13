package Vehicles;


public class Bus extends Vehicle{

    public Bus(double fuelQuantity, double litersPerKm,double tankCapacity) {
        super(fuelQuantity, litersPerKm,tankCapacity);
    }
public String drive(double distance){
    double FULL_BUS_FUEL_INCREASE=1.4;
return super.drive(distance,FULL_BUS_FUEL_INCREASE);
}

    public String driveEmpty(double distance) {
return super.drive(distance,0);
    }
}
