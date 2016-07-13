package app.homes;

import app.items.Device;
import app.Room;
import app.people.Child;
import app.people.Person;

import java.util.ArrayList;
import java.util.List;
public abstract class Home {
    protected List<Room> rooms;
    protected   List<Device> devices;
    protected List<Person> people;
    protected List<Child> children;
    protected double budget;
    protected double bills;
    protected double salaries;

    public Home() {
        this.rooms=new ArrayList<>();
        this.devices=new ArrayList<>();
        this.people=new ArrayList<>();
        this.children=new ArrayList<>();
        this.budget=0;
        this.bills=0;
        this.salaries=0;

    }
    public boolean payBills(){

        if (this.budget>=this.bills){
            this.budget-=this.bills;
            return true;
        }else {
            return false;
        }
    }
    public void receiveSalary(){
        this.budget+=this.salaries;

    }
    protected void calculateSalaries(){
        this.salaries=this.people.stream()
                .mapToDouble(Person::getIncome)
                .sum();
    }
    protected void calculateBills(){
        this.salaries=this.rooms.stream()
                .mapToDouble(Room::getConsumption)
                .sum()
                +
                this.devices.stream()
                .mapToDouble(Device::getConsumption)
                .sum()
                +
                this.children.stream()
                        .mapToDouble(Child::getCost)
                        .sum();

    }
protected  void addRooms(int roomCount,double roomConsumption){
    for (int i = 0; i < roomCount; i++) {
        this.rooms.add(new Room(roomConsumption));
    }
}
    public abstract void addRooms();

}
