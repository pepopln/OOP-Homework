package SoftUni.CarSalesman;


public class Car {
    String model;
    Engine engine;
    int weight;
    String color;

    public Car(String model, Engine engine, int weight, String color) {

        this.model = model;
        this.engine = engine;
        this.weight = weight;
        this.color = color;
    }

    public Car(String model, Engine engine) {
        this(model,engine,-1,"n/a");
    }
    public void setWeight(int weight){
        this.weight=weight;
    }
    public int getWeight(){
        return weight;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color=color;
    }

    @Override
    public String toString() {
        StringBuilder output=new StringBuilder();
        output.append(this.model+":");
        output.append(System.lineSeparator());
        output.append(this.engine);
        output.append(System.lineSeparator());
        output.append("  Weight: ");
        output.append(this.weight==-1?"n/a":this.weight);
        output.append(System.lineSeparator());
        output.append("  Color: "+this.color);
        return output.toString();
    }
}
