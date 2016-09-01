package DependencyInversion.strategies;

public class MultiplyStrategy implements Strategy {

    @Override
    public int calculate(int firstNumber, int secondNumber) {
        return firstNumber*secondNumber;
    }
}
