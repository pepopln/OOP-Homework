package Exam.system;


import Exam.system.Hardware.Hardware;
import Exam.system.Software.Software;

import java.util.ArrayList;
import java.util.List;

public class ComputerSystem {
private static List<Hardware> hardwares;
    private static List<Software> softwares;

    private ComputerSystem() {
        this.hardwares=new ArrayList<>();
        this.softwares =new ArrayList<>();
    }

    public static void setHardwares(Hardware hardware) {
        hardwares.add(hardware);
    }

    public static void setSoftwares(Software software) {
        softwares.add(software);
    }

    public static List<Hardware> getHardwares() {
        return hardwares;
    }

    public static void systemAnalysis(){
        StringBuilder sb = new StringBuilder();
//        System Analysis
//        Hardware Components: {countOfHardwareComponents}
//        Software Components: {countOfSoftwareComponents}
//        Total Operational Memory: {totalOperationalMemoryInUse} / {maximumMemory}
//        Total Capacity Taken: {totalCapacityTaken} / {maximumCapacity}

        sb.append("System Analysis");
        sb.append("\n");
        sb.append(String.format("Hardware Components: %d",hardwares.size()));
        sb.append("\n");
        sb.append(String.format("Software Components: %d",softwares.size()));
        sb.append("\n");
        sb.append(String.format("Total Operational Memory: %d / %d",
                softwares.stream().mapToInt(Software::getMemoryConsumption).sum()
                ,hardwares.stream().mapToInt(Hardware::getMemory).sum()));
        sb.append("\n");
        sb.append(String.format("Total Capacity Taken: %d / %d",
                softwares.stream().mapToInt(Software::getCapacityConsumption).sum(),
                hardwares.stream().mapToInt(Hardware::getCapacity).sum()));
        sb.append("\n");
        System.out.println(sb.toString());
    }

    public static void systemSplit() {
        StringBuilder output = new StringBuilder();
        hardwares.stream().forEach(a-> {
                System.out.printf("Hardware Component - %s\n",a);
            System.out.printf("Express Software Components - %d\n",a.getExprSoftComponentsSize());
            System.out.printf("Light Software Components - %d\n",a.getLightSoftComponentsSize());
            System.out.printf("Memory usage: %d / %d\n",a.getUsageMemory(),a.getMemory());
            System.out.printf("Capacity Usage: %d / %d\n",a.getUsageCapcity(),a.getCapacity());
            System.out.printf("Type: %s",a.getClass().getSimpleName().replace("Hardware",""));
            System.out.printf("Software Components: ");
            a.getExprSoftComponents().stream().forEach(b-> System.out.print(b.toString().replace("[","").replace("]","").trim()));
            a.getLightSoftComponents().stream().forEach(c-> System.out.print(c.toString().replace("[","").replace("]","").trim()));

    });
    }
}
