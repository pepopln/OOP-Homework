package Exam.system.Software;


public abstract class Software {
//    Software components have a name, a type, capacity consumption and memory consumption.
    String name;
    Integer capacityConsumption;
    Integer memoryConsumption;
    String hardwareComponentName;

    public Software(String hardwareComponentName,String name, Integer capacityConsumption, Integer memoryConsumption) {
        this.hardwareComponentName=name;
        this.name = name;
        this.capacityConsumption = capacityConsumption;
        this.memoryConsumption = memoryConsumption;
    }

    public Software(String name, Integer capacityConsumption, Integer memoryConsumption) {

    }

    public void setCapacityConsumption(Integer capacityConsumption) {
        this.capacityConsumption = capacityConsumption;
    }

    public void setMemoryConsumption(Integer memoryConsumption) {
        this.memoryConsumption = memoryConsumption;

    }

    public Integer getCapacityConsumption() {
        return capacityConsumption;
    }

    public Integer getMemoryConsumption() {
        return memoryConsumption;
    }

}
