package Exam.system.Hardware;


public class HeavyHardware extends Hardware{

    public HeavyHardware(String name, Integer capacity, Integer memory) {
        super(name, capacity, memory);
    }

    @Override
    public void setCapacity(Integer capacity) {
        super.setCapacity(capacity*2);
    }

    @Override
    public void setMemory(Integer memory) {
        super.setMemory(memory-memory/4);
    }
}
