package app.homes;

import app.items.Device;
import app.people.Person;

public class HomeFactory {
    public Home createHome(String[] homeArgs){
        String homeType = homeArgs[0];
        Home home=null;
        switch (homeType){
            case "YoungCouple":
                home = new YoungCoupleHome(
                        new Person(Double.valueOf(homeArgs[1])),
                        new Person(Double.valueOf(homeArgs[2])),
                        new Device(Double.parseDouble(homeArgs[3])),
                        new Device(Double.parseDouble(homeArgs[4])),
                        new Device(Double.parseDouble(homeArgs[5]))
                        );
                break;
            case "YoungCoupleHomeWithChildren":
                //
                break;
        }
        home.addRooms();
        home.calculateSalaries();
        home.calculateBills();
        return home;
    }
}
