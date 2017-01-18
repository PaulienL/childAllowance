import jdk.nashorn.internal.ir.IfNode;


import java.security.PublicKey;

/**
 * Created by paulienl on 18/01/2017.
 */
public class PayOut {

    public double calculateAndReturnAllowance(Family familie){
    double total = 0;
    int numberOfChildren = 0;
    numberOfChildren = familie.getNumberOfChildren();
        for (int i = 0; i <numberOfChildren ; i++) {
            total+= familie.getChildren().get(i).getAgeAddition() + ;
        }
    return total;
    }
}
