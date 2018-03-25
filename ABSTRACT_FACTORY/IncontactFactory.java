
import java.util.*;

/**
 * 
 */
public class IncontactFactory extends contactFactory implements contactFactory {

    /**
     * Default constructor
     */
    public IncontactFactory() {
    }

    /**
     * @return
     */
    public address createAddr() {
        // TODO implement here
        return new InAddress();
    }
    
    /**
     * @return
     */
    public PhoneNo createPhno() {
        // TODO implement here
        return new InPhone();
    }

}
