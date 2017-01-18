import java.time.LocalDate;
import java.time.Period;

/**
 * Created by paulienl on 18/01/2017.
 */
public class Child {
    private LocalDate birthDate;
    private String name;
    private int number;

    public Child(LocalDate birthDate, String name, int number) {
        this.birthDate = birthDate;
        this.name = name;
        this.number = number;
    }

    public int getAge()
    {
        int age = Period.between(LocalDate.now(), birthDate).getYears();
        return age;
    }

    public double getAgeAddition()
    {
        if(getAge() <=11)
        {
            Rates.getAgeAddition6To11(number);
        }
        else if(getAge()<=17)
        {
            Rates.getAgeAddition12To17(number);
        }
        else
        {
            Rates.getAgeAddition18(number);
        }
    }
}
