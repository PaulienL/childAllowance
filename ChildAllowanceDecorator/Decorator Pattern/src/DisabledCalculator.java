/**
 * Created by paulienl on 20/01/2017.
 */
public class DisabledCalculator implements Calculator {
    private Child child;
    private Calculator calculator;

    public DisabledCalculator(Child child, Calculator calculator) {
        this.child = child;
        this.calculator = calculator;
    }

    @Override
    public double calculate(Child child) {
       if(child.getIndex() == 0)
       {
           return calculator.calculate(child) + 1.00;
       }
       else if(child.getIndex() == 1)
       {
           return calculator.calculate(child) + 2.00;
       }
       else
       {
           return calculator.calculate(child) + 3.00;
       }
    }


}
