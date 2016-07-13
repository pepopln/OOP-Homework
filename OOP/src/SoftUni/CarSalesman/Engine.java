package SoftUni.CarSalesman;


public class Engine {
   private String model;
    private int power;
    private int displacement;
    private String efficiency;

    public Engine(String model, int power, int displacement, String efficiency) {
        this.model = model;
        this.power = power;
        this.displacement = displacement;
        this.efficiency = efficiency;
    }

    public Engine(String model, int power) {
        this(model,power,-1,"n/a");
    }
    public int getDisplacement(){
        return displacement;
    }
    public String getEfficiency(){
        return efficiency;
    }
    public void setDisplacement(int displacement){
        this.displacement=displacement;
    }
    public void setEfficiency(String efficiency){
        this.efficiency=efficiency;
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();
        output.append(String.format("  %s:%n",this.model));
        output.append(String.format("    Power: %d%n",this.power));
        output.append(String.format("    Displacement: %s%n",this.displacement==-1?"n/a":this.displacement));
        output.append(String.format("    Efficiency: %s",this.efficiency));

        return output.toString();
    }
}
