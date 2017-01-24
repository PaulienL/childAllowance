/**
 * Created by paulienl on 20/01/2017.
 */
public class OrphanCalculator implements Calculator {
    private Child child;
    private Calculator calculator;


    public OrphanCalculator(Child child, Calculator calculator) {
        this.child = child;
        this.calculator = calculator;
    }

    @Override
    public double calculate(Child child) {
        return calculator.calculate(child) + 5.00;

            }
}
