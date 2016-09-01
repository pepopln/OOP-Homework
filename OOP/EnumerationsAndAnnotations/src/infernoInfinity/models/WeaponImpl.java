package infernoInfinity.models;

import infernoInfinity.enums.Gem;
import infernoInfinity.enums.WeaponType;
import infernoInfinity.interfaces.Weapon;

public class WeaponImpl implements Weapon {

    private String name;
    private WeaponType type;
    private Gem[] sockets;

    public WeaponImpl(String name, WeaponType type) {
        this.setName(name);
        this.setType(type);

        this.sockets = new Gem[this.type.getMaxNumberOfSockets()];
    }

    private void setType(WeaponType type) {
        this.type = type;
    }

    private void setName(String name) {
        this.name = name;
    }


    @Override
    public void addGem(Gem gem, int index) {

        if (index >= 0 && index < this.sockets.length) {
            this.sockets[index] = gem;
        }
    }

    @Override
    public void removeGem(int index) {
        if (index >= 0 && index < this.sockets.length) {
            this.sockets[index] = null;
        }
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
       return String.format("%s: %d-%d Damage, +%d Strength, +%d Agility, +%d Vitality",
               this.getName(),
               this.getMinDamage(),
               this.getMaxDamage(),
               this.getAllStrength(),
               this.getAllAgility(),
               this.getVitality());
    }

    private int getMinDamage() {
        int minDamage = this.type.getMinDamage();
        for (int i = 0; i < getAllStrength(); i++) {
            minDamage += 2;
        }
        for (int i = 0; i < getAllAgility(); i++) {
            minDamage += 1;
        }
        return minDamage;
    }

    private int getMaxDamage(){
        int maxDamage =this.type.getMaxDamage();
        for (int i = 0; i < getAllStrength(); i++) {
            maxDamage+=3;
        }
        for (int i = 0; i < getAllAgility(); i++) {
            maxDamage+=4;
        }
        return maxDamage;
    }

    private int getAllStrength() {
        int strength = 0;
        for (Gem socket : sockets) {
            if (socket != null) {
                strength += socket.getStrength();
            }
        }
        return strength;
    }

    private int getAllAgility() {
        int agility = 0;
        for (Gem socket : sockets) {
            if (socket != null) {
                agility += socket.getAgility();
            }
        }
        return agility;
    }

    private int getVitality() {
        int vitality=0;
        for (Gem socket : sockets) {
            if (socket!=null){
                vitality+=socket.getVitality();
            }
        }
        return vitality;
    }
}
