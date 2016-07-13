package app.homes;

import app.items.Device;
import app.people.Child;
import app.people.Person;

import java.util.Arrays;

public class YoungCoupleWithChildrenHome extends YoungCoupleHome{

    public YoungCoupleWithChildrenHome(Person male, Person female, Device tv, Device fridge, Device laptop, Child... children) {

        super(male,female,tv,fridge,laptop);
        this.children.addAll(Arrays.asList(children));
    }
}
