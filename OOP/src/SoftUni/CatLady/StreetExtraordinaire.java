package SoftUni.CatLady;


public class StreetExtraordinaire extends Cat{
    private int decibelsOfMeows;
    public StreetExtraordinaire(String name,int decibelsOfMeows) {
        super(name);
        this.decibelsOfMeows=decibelsOfMeows;
    }

    @Override
    public String toString() {
        return String.format("StreetExtraordinaire %s %d.00",this.name,this.decibelsOfMeows);
    }
}
