
import java.util.*;

/**
 * 
 */
public class InAddress extends address {
    public String coun="IND";

    /**
     * Default constructor
     */
    public InAddress() {
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
    public void InAddress() {
        // TODO implement here
    }

    /**
     * @return
     */
    public String getcountry() {
        return coun;// TODO implement here
        return "";
    }

    /**
     * @return
     */
}
