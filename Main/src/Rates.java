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

    public static double getSelfEmployed()
    {
        return 61.79;
    }

    public static double getOrphanRate()
    {
        return 353.76;
    }

    public static double getNormalRate(int childIndex)
    {
        if(childIndex==0)
        {
            return 92.09;
        }
        else if(childIndex==1)
        {
            return 170.39;
        }
        else
        {
            return 254.40;
        }
    }
}
