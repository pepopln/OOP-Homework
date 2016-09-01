package DependencyInversion.strategies;

public class SubtractionStrategy implements Strategy{


    @Override
    public int calculate(int firstNumber, int secondNumber) {
        return firstNumber-secondNumber;
    }
}
