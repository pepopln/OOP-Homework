package KingsGambit.models;

import KingsGambit.interfaces.king.King;
import KingsGambit.interfaces.unit.Unit;

public class FoodMan extends UnitImpl {

    private static final int DEFAULT_HEALTH=2;


    public FoodMan(String name, King king) {
        super(name, king);
        this.setHealthPoints(DEFAULT_HEALTH);
    }

    @Override
    public void handleRespondToAttack() {
        System.out.printf("Footman %s is panicking!\n",this.getName());
    }
}
