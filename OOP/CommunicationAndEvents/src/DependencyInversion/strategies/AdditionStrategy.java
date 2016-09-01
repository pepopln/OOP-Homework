package DependencyInversion.strategies;

public class AdditionStrategy implements Strategy {



    public int calculate(int firstNumber, int secondNumber) {
        return firstNumber+secondNumber;
    }
}
