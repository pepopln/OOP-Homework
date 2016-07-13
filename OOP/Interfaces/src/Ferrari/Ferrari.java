package Ferrari;


public class Ferrari implements Car{
    String model;
    String driver;


    public String useBrakes() {
        return "Brakes!";

    }

      public String pushTheGas() {
          return "Zadu6avam sA!";

    }


    public String getDriver() {
        return driver;
    }

      public String getModel() {
        return model;
    }
    public Ferrari(String driver) {
        this.setModel();
        this.driver = driver;
    }

    private void setModel() {
        this.model = "488-Spider";
    }

    @Override
    public String toString() {
        return String.format("%s/%s/%s/%s",this.getModel(),this.useBrakes(),this.pushTheGas(),this.getDriver());
    }
}
