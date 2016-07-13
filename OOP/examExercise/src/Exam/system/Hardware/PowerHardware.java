package Exam.system.Hardware;

import Exam.system.Software.Software;

import java.util.List;

public class PowerHardware extends Hardware {
private List<Software> softs;
    public PowerHardware(String name, Integer capacity, Integer memory) {
        super(name, capacity, memory);
    }
}
