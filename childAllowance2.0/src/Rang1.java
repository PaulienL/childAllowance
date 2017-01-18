import java.time.LocalDate;

/**
 * Created by paulienl on 18/01/2017.
 */
public class Rang1 extends Rang {


    public Rang1(LocalDate birthDate) {
        super(birthDate, 16.04, 24.43, 28.16);
    }


    @Override
    public double getAgeAdditionBetweenSixAndEleven() {
        return this.ageAdditionBetweenSixAndEleven;
    }

    @Override
    public double getAgeAdditionBetweenTwelveAndSeventeen() {
        return this.ageAdditionBetweenTwelveAndSeventeen;
    }

    @Override
    public double getAgeAdditionPlusEighteen() {
        return this.ageAdditionPlusEighteen;
    }
}
