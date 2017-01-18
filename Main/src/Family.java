import java.util.ArrayList;

/**
 * Created by paulienl on 18/01/2017.
 */
public class Family {
    private Parents mother;
    private Parents father;
    private ArrayList<Child> children;

    public Family(Parents mother, Parents father) {
        this.mother = mother;
        this.father = father;
        children = new ArrayList<Child>();
    }

    public void addChild(Child child)
    {
        children.add(child);
    }

    public double getMoneyBasedOnSituation(int childIndex)
    {
        if(getSelfEmployed()==true)
        {
            return Rates.getSelfEmployed();
        }

        if(getBothAlive()==false)
        {
            return Rates.getOrphanRate();
        }
        else
        {
            return Rates.getNormalRate(childIndex);
        }
    }

    public boolean getBothAlive()
    {
        if (father.isAlive() && mother.isAlive())
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean getSelfEmployed()
    {
        if (father.isSelfEmployed())
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public int getNumberOfChildren()
    {
        return children.size();
    }

    public Child getChild(int index)
    {
        return children.get(index); 
    }
}
