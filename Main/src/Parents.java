/**
 * Created by paulienl on 18/01/2017.
 */
public class Parents {
    private boolean isAlive;
    private boolean isSelfEmployed;

    public Parents(boolean isAlive, boolean isSelfEmployed) {
        this.isAlive = isAlive;
        this.isSelfEmployed = isSelfEmployed;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public boolean isSelfEmployed() {
        return isSelfEmployed;
    }
}
