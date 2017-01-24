/**
 * Created by paulienl on 20/01/2017.
 */
public class AgeAddCalculator implements Calculator {
    private Child child;
    private Calculator calculator;

    public AgeAddCalculator(Child child, Calculator calculator) {
        this.child = child;
        this.calculator = calculator;
    }

    @Override
    public double calculate(Child child) {
        if(child.getIndex()==0)
        {
            return firstChildadds(child.getAge())+calculator.calculate(child);
        }
        else
        {
            return otherChild(child.getAge()) + calculator.calculate(child);
        }

    }

    public double firstChildadds(int age)
    {
        if(age<=11)
        {
            return 2.00;
        }
        else if (age<=17)
        {
            return 3.00;
        }
        else
        {
            return 4.00;
        }
    }

    public double otherChild(int age)
    {
        if (age<=11)
        {
            return 4.00;
        }
        else if (age<=17)
        {
            return 5.00;
        }
        else
        {
            return 6.00;
        }
    }
}
