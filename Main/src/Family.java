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

    public ArrayList<Child> getChildren() {
        return children;
    }
}
