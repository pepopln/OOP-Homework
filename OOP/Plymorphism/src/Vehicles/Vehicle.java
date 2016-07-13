package Vehicles;


import java.text.DecimalFormat;

abstract class Vehicle {
    private double fuelQuantity;
    private double litersPerKm;
    private double tankCapacity;

     Vehicle(double fuelQuantity, double litersPerKm,double tankCapacity) {
        this.setFuelQuantity(fuelQuantity);
        this.setLitersPerKm(litersPerKm);
        this.setTankCapacity(tankCapacity);
    }

    private void setTankCapacity(double tankCapacity) {
        this.tankCapacity = tankCapacity;
    }

    public double getTankCapacity() {
        return tankCapacity;
    }

    public double getFuelQuantity() {
        return fuelQuantity;
    }

    public void setFuelQuantity(double fuelQuantity) {
if (fuelQuantity<0){
    throw new IllegalArgumentException("Fuel must be a positive number");
}
        this.fuelQuantity = fuelQuantity;
    }

    public double getLitersPerKm() {
        return litersPerKm;
    }

    public void setLitersPerKm(double litersPerKm) {

        this.litersPerKm = litersPerKm;
    }
    String drive(double distance,double addition){
        if ((this.fuelQuantity/(this.litersPerKm+addition)<distance)){
            throw new IllegalArgumentException(String.format("%s needs refueling",this.getClass().getSimpleName()));
        }
        this.fuelQuantity-=distance*(this.litersPerKm+addition);
        DecimalFormat df = new DecimalFormat("0.##########");
        return String.format("%s travelled %s km",this.getClass().getSimpleName(),df.format(distance));
    }
    public void refuel(double fuel){
        if (this.tankCapacity<this.fuelQuantity+fuel){
            throw new IllegalArgumentException("Cannot fit fuel in tank");
        }
        this.fuelQuantity+=fuel;
    }

    @Override
    public String toString() {
        return String.format("%s: %.2f",this.getClass().getSimpleName(),this.fuelQuantity);
    }
}
