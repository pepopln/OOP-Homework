package KingsGambit.interfaces.king;

import KingsGambit.interfaces.unit.Unit;

import java.util.Collection;

public interface Leader {

    void addUnits(Collection<Unit> units);

    void removeDeadUnit(String unitName);

    void respondToKill(String name);
}
