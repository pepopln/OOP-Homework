package SoftUni.CatLady;

/**
 * Created by pepo on 25.6.2016 г..
 */
public class Siamese extends Cat {
    private int earSize;
    public Siamese(String name,int earSize) {
        super(name);
        this.earSize=earSize;
    }

    @Override
    public String toString() {
        return String.format("Siamese %s %d.00",this.name,this.earSize);
    }
}
