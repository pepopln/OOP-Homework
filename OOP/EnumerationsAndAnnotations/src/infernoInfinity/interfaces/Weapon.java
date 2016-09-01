package infernoInfinity.interfaces;

import infernoInfinity.enums.Gem;

public interface Weapon {

    void addGem(Gem gem,int index);
    void removeGem(int index);
    String getName();
}
