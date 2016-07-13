package CarTrip;


public class Car {
private double speed;
    private double fuelAmount;
    private double fuelEconomy;
    private double totalTime;
    private double totalDistance;

    public void refuel(double fuel){
        this.fuelAmount+=fuel;
    }

    public void travel(double distance){
        double canTravelDistance=(this.fuelAmount*100)/fuelEconomy;
        if (canTravelDistance<distance){
            distance=canTravelDistance;
        }
        double littersAmount = distance*(this.fuelEconomy/100);
        this.fuelAmount-=littersAmount;
        this.totalDistance+=distance;
        this.totalTime+=(distance/this.speed)*60;
    }
public double getTotalTime(){
    return totalTime;
}
    public double getTotalDistance(){
        return totalDistance;
    }


    public double getFuelAmount() {
        return this.fuelAmount;
    }
    public Car(double speed, double fuelAmount, double fuelEconomy) {
        this.speed=speed;
        this.fuelAmount=fuelAmount;
        this.fuelEconomy=fuelEconomy;
        this.totalTime=0;
        this.totalDistance=0.0;
    }


}
