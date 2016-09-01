package DependencyInversion.strategies;

public interface Calculator {
    int performCalculation(int firstOperand, int secondOperand);

    void changeStrategy(Strategy strategy);
}
