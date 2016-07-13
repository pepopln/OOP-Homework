package Exam.system.Software;


public class LightSoftware extends Software {

    public LightSoftware(String name, Integer capacityConsumption, Integer memoryConsumption) {
        super(name, capacityConsumption, memoryConsumption);
    }

    @Override
    public void setCapacityConsumption(Integer capacityConsumption) {
        super.setCapacityConsumption(capacityConsumption+capacityConsumption/2);
    }

    @Override
    public void setMemoryConsumption(Integer memoryConsumption) {
        super.setMemoryConsumption(memoryConsumption-memoryConsumption/2);
    }
}
