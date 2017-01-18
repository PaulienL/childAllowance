/**
 * Created by paulienl on 18/01/2017.
 */
public class Rates {

    public static double getAgeAddition6To11(int childIndex)
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

    public static double getAgeAddition12To17(int childIndex)
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

    public static double getAgeAddition18(int childIndex)
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
