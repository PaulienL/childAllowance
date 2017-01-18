import java.time.LocalDate;
import java.time.Period;

/**
 * Created by paulienl on 18/01/2017.
 */
public class Child {
    private LocalDate birthDate;
    private String name;
    private int childIndex;

    public Child(LocalDate birthDate, String name, int childIndex) {
        this.birthDate = birthDate;
        this.name = name;
        this.childIndex = childIndex;
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
            if(childIndex==0)
            {
                return 16.04;
            }
            else
            {
                return 31.99;
            }
        }
        else if(getAge()<=17)
        {
            if(childIndex==0)
            {
                return 24.43;
            }
            else
            {
                return 48.88;
            }
        }
        else
        {
            if(childIndex==0)
            {
                return 28.16;
            }
            else
            {
                return 62.15;
            }
        }
    }
}
