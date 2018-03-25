
import java.util.*;

/**
 * 
 */
public class contact {

    /**
     * Default constructor
     */
    public contact() {
    }

    /**
     * 
     */
    public String name;

    /**
     * 
     */
    public String company;

    /**
     * @return
     */
    public String toString() {
       return ("(" + name + ", " + company + ")");
    }

    /**
     * @param n 
     * @param c 
     * @return
     */
    public void setContact(String n, String c) {
        name = n;
        company = c;
    }

}
