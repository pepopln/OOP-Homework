package Exam.system.Hardware;


import Exam.system.Software.ExpressSoftware;
import Exam.system.Software.LightSoftware;
import Exam.system.Software.Software;

import java.util.List;

public abstract class Hardware  {
    //Hardware components have a name, a type, a maximum capacity and a maximum memory.
    private String name;

    private Integer capacity;
    private Integer memory;
    private List<ExpressSoftware>exprSoftComponents;
    private List<LightSoftware> lightSoftComponents;

    public List<ExpressSoftware> getExprSoftComponents() {
        return exprSoftComponents;
    }

    public List<LightSoftware> getLightSoftComponents() {
        return lightSoftComponents;
    }

    public Integer getLightSoftComponentsSize() {
        return lightSoftComponents.size();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public Integer getMemory() {
        return memory;
    }

    public void setMemory(Integer memory) {
        this.memory = memory;
    }

    public Hardware(String name, Integer capacity, Integer memory) {
        this.name = name;
        this.capacity = capacity;
        this.memory = memory;

    }

    public void setExprSoftComponents(Software expressSoft) {
        exprSoftComponents.add((ExpressSoftware) expressSoft);
    }

    private void setLightSoftComponents(LightSoftware lightSoftComponent) {
        this.lightSoftComponents.add(lightSoftComponent);
    }

    public Integer getExprSoftComponentsSize() {
        return exprSoftComponents.size();
    }

    public Integer getUsageMemory() {
        return lightSoftComponents.stream().mapToInt(LightSoftware::getMemoryConsumption).sum()+
                exprSoftComponents.stream().mapToInt(ExpressSoftware::getMemoryConsumption).sum();
    }

    public Integer getUsageCapcity() {
        return lightSoftComponents.stream().mapToInt(LightSoftware::getCapacityConsumption).sum()+
                exprSoftComponents.stream().mapToInt(ExpressSoftware::getCapacityConsumption).sum();
    }


}
