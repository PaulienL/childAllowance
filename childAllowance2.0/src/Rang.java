import java.time.LocalDate;
import java.time.Period;

/**
 * Created by paulienl on 18/01/2017.
 */
public abstract class Rang {
    private LocalDate birthDate;
    protected double ageAdditionBetweenSixAndEleven;
    protected double ageAdditionBetweenTwelveAndSeventeen;
    protected double ageAdditionPlusEighteen;


    public Rang(LocalDate birthDate) {
        this.birthDate = birthDate;
        ageAdditionBetweenSixAndEleven=0.00;
        ageAdditionBetweenTwelveAndSeventeen=0.00;
        ageAdditionPlusEighteen=0.00;
    }

    public int getAge()
    {
        return Period.between(LocalDate.now(), birthDate).getYears();
    }

    public abstract double getAgeAdditionBetweenSixAndEleven() ;

    public abstract double getAgeAdditionBetweenTwelveAndSeventeen() ;

    public abstract double getAgeAdditionPlusEighteen() ;

    public double getAgeAddition()
    {
        if(getAge() <=11)
        {
            return getAgeAdditionBetweenSixAndEleven();
        }
        else if(getAge()<=17)
        {
            return getAgeAdditionBetweenTwelveAndSeventeen();
        }
        else
        {
            return getAgeAdditionPlusEighteen();
        }
    }
}
