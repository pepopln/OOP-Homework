package app.items;


public class Device {
   private double consumption;
    public double getConsumption(){
        return this.consumption;
    }

    public Device(double consumption) {
        this.setConsumption(consumption);
    }

    private void setConsumption(double consumption) {
        this.consumption = consumption;
    }
}
