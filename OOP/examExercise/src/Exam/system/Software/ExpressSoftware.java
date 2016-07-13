package Exam.system.Software;


public class ExpressSoftware extends Software {

    public ExpressSoftware(String name, Integer capacityConsumption, Integer memoryConsumption) {
        super(name, capacityConsumption, memoryConsumption);
    }

    @Override
    public void setMemoryConsumption(Integer memoryConsumption) {
        super.setMemoryConsumption(memoryConsumption*2);
    }
}
