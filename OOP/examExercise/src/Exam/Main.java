package Exam;


import Exam.system.ComputerSystem;
import Exam.system.Hardware.Hardware;
import Exam.system.Hardware.HeavyHardware;
import Exam.system.Hardware.PowerHardware;
import Exam.system.Software.ExpressSoftware;
import Exam.system.Software.Software;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] command = reader.readLine().split("\\W+");
//       	RegisterPowerHardware(name, capacity, memory)
//       	RegisterHeavyHardware(name, capacity, memory)
//      RegisterExpressSoftware(hardwareComponentName, name, capacity, memory)
//      	RegisterLightSoftware(hardwareComponentName, name, capacity, memory)
//        ReleaseSoftwareComponent(hardwareComponentName, softwareComponentName)

        while (true) {
            if (command[0].equals("System Split")){
                ComputerSystem.systemSplit();
                break;
            }
            switch (command[0]){

                case "Analyze":
                ComputerSystem.systemAnalysis();
                    break;
                case "RegisterPowerHardware":
                    Hardware powerHard=new PowerHardware(command[1],Integer.valueOf(command[2]),Integer.valueOf(command[3]));
                    ComputerSystem.setHardwares(powerHard);
                    break;
                case "RegisterHeavyHardware":
                    Hardware heavyHard = new HeavyHardware(command[1],Integer.valueOf(command[2]),Integer.valueOf(command[3]));
                     ComputerSystem.setHardwares(heavyHard);
                    break;
                case "RegisterExpressSoftware":
                    Software expressSoft = new ExpressSoftware(command[2],Integer.valueOf(command[3]),Integer.valueOf(command[4]));
                    ComputerSystem.setSoftwares(expressSoft);
                    int index=ComputerSystem.getHardwares().indexOf(command[1]);
                         Hardware currentHardware=   ComputerSystem.getHardwares().get(index);
                    currentHardware.setExprSoftComponents(expressSoft);


                    break;
                case "RegisterLightSoftware":

                    break;
                case "ReleaseSoftwareComponent":

                    break;


                }
            command = reader.readLine().split("\\W+");

            }


        }

    private static void classComponent(String[] command) {
    }
}