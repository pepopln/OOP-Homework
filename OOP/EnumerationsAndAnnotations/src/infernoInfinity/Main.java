package infernoInfinity;

import infernoInfinity.enums.Gem;
import infernoInfinity.enums.WeaponType;
import infernoInfinity.interfaces.Weapon;
import infernoInfinity.models.WeaponImpl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String,Weapon> weapons = new HashMap<>();
        while (true){
            String line = reader.readLine();
            if (line.equals("END")){
                break;
            }
            String[] params = line.split(";");
            switch (params[0]){
                case "Create":{
                    String name = params[2];
                    WeaponType weaponType = WeaponType.valueOf(params[1]);
                    Weapon weapon = new WeaponImpl(params[2],weaponType);
                    weapons.put(name,weapon);
                    break;}
                case "Add":{
                    String weaponName = params[1];
                    int index = Integer.parseInt(params[2]);
                    Gem gem = Gem.valueOf(params[3]);
                    Weapon currentWeapon = weapons.get(weaponName);
                    currentWeapon.addGem(gem,index);
                    weapons.put(weaponName,currentWeapon);
                    break;}
                case "Remove": {
                    String weaponName =params[1];
                    int index = Integer.parseInt(params[2]);
                    Weapon currentWeapon = weapons.get(weaponName);
                    currentWeapon.removeGem(index);
                    weapons.put(weaponName,currentWeapon);
                    break;
                }
                case "Print":{
                    String weaponName = params[1];
                    Weapon currentWeapon = weapons.get(weaponName);
                    System.out.println(currentWeapon.toString());
                }

            }

        }
    }
}
