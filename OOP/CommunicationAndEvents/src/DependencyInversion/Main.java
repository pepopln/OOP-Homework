package DependencyInversion;

import DependencyInversion.strategies.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Calculator calculator = new PrimitiveCalculator();
        try {
            String line ;
            while (!(line=reader.readLine()).equalsIgnoreCase("end")){
                String[] params = line.split("\\s+");
                switch (params[0]){
                    case "mode":
                        try {


                            Strategy strategy = getNewStrategy(params[1]);
                            calculator.changeStrategy(strategy);
                        }catch (IllegalStateException ex){
                            System.out.println(ex.getMessage());
                        }
                        break;
                    default:
                        int firstNumber = Integer.valueOf(params[0]);
                        int secondNumber = Integer.valueOf(params[1]);
                        System.out.println(calculator.performCalculation(firstNumber,secondNumber));
                        break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static Strategy getNewStrategy(String operator) {
        switch (operator){
            case "+":
                return new AdditionStrategy();
            case "-":
                return new SubtractionStrategy();
            case "*":
                return new MultiplyStrategy();
            case "/":
                return new DividingStrategy();
            default:
                throw  new  IllegalStateException("No such strategy");
        }
    }
}
