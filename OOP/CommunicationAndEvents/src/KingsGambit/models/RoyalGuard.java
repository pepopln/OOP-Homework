package KingsGambit.models;

import KingsGambit.interfaces.king.King;
import KingsGambit.interfaces.unit.Unit;

public class RoyalGuard extends UnitImpl {

    private static final int DEFAULT_HEALT=3;

    public RoyalGuard(String name, King king) {
        super(name, king);
        this.setHealthPoints(DEFAULT_HEALT);
    }

    @Override
    public void handleRespondToAttack() {
        System.out.printf("Royal Guard %s is defending!\n",this.getName());
    }
}
