package SoftUni.CatLady;

/**
 * Created by pepo on 25.6.2016 г..
 */
public class Cymric extends Cat {
    private int furLength;
    public Cymric(String name, int furLength) {
        super(name);
        this.furLength=furLength;

    }

    @Override
    public String toString() {
        return String.format("Cymric %s %d.00",this.name,this.furLength);
    }
}
