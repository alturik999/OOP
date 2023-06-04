package HW7;

public class CalculatorFactory implements ICalculatorFactorable {
    @Override
    public ComplexCalculable create(ComplexNumberCalculator primaryArg){
        return new ComplexCalculator(primaryArg);
    }
}