package DependencyInversion;

import DependencyInversion.strategies.AdditionStrategy;
import DependencyInversion.strategies.Calculator;
import DependencyInversion.strategies.Strategy;

public class PrimitiveCalculator implements Calculator{
//- changeStrategy(char operator) and performCalculation(int firstOperand, int secondOperand
private Strategy currentStrategy;

    public PrimitiveCalculator() {
        this.currentStrategy=new AdditionStrategy();
    }

    @Override
    public int performCalculation(int firstOperand, int secondOperand) {
        return this.currentStrategy.calculate(firstOperand,secondOperand);
    }

    @Override
    public void changeStrategy(Strategy strategy) {
        this.currentStrategy=strategy;
    }
}
