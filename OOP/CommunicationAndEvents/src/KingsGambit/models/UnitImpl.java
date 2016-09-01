package KingsGambit.models;

import KingsGambit.interfaces.king.King;
import KingsGambit.interfaces.unit.Unit;

public abstract class UnitImpl implements Unit {
private String name ;
    private int healthPoints;
    private King king;

    public UnitImpl(String name, King king) {
        this.setName(name);
        this.setKing(king);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealthPoints() {
        return this.healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public King getKing() {
        return this.king;
    }

    public void setKing(King king) {
        this.king = king;
    }

    @Override
    public void handleKill() {
        this.setHealthPoints(this.getHealthPoints()-1);
        if (this.getHealthPoints()==0){
            this.king.removeDeadUnit(this.getName());
        }
    }
}
