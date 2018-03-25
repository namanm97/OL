
import java.util.*;

/**
 * 
 */
public class UscontactFactory extends contactFactory implements contactFactory {

    /**
     * Default constructor
     */
    public UscontactFactory() {
    }

    public new UsPhone createPhno() {
        // TODO implement here    }
    public address createAddr() {
        // TODO implement here
        return new UsAddress();
    }

    /**
     * @return
     */
    public PhoneNo createPhno() {
        // TODO implement here
        return new USPhone();
    }

}
