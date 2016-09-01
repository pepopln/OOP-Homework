package DependencyInversion.strategies;

public class DividingStrategy implements Strategy{

    @Override
    public int calculate(int firstNumber, int secondNumber) {
        return firstNumber/secondNumber;
    }
}
