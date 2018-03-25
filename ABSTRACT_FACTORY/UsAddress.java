
import java.util.*;

/**
 * 
 */
public class UsAddress extends address {
    public String coun="USA";

    /**
     * Default constructor
     */
    public UsAddress() {
        super.inputdata();
        super.display();
        printAddr();
    }

    /**
     * 
     */

    /**
     * @return
     */
    public void printAddr() {
        System.out.println(coun);
 // TODO implement here
    }

    /**
     * 
     */
    public void UsAddress() {
        // TODO implement here
    }

    /**
     * @return
     */
    public String getcountry() {
        return coun;
// TODO implement here
        
    }

    /**
     * @return
     */
    public abstract String getcountry();

}
