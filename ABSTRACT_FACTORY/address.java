
import java.util.*;

/**
 * 
 */
public class address {
    /**
     * Default constructor
     */
    public address() {
    }

    /**
     * 
     */
    public String housename;

    /**
     * 
     */
    public Strnig street;

    /**
     * 
     */
    public Street city;

    /**
     * 
     */
    public String state;

    /**
     * @return
     */
    public void inputdata() {
        Scanner in = new Scanner(System.in);
        System.out.println("ENTER THE HOUSENAME:\t");
        housename = in.nextLine();
        System.out.println("ENTER THE CITY:\t");
        city = in.nextLine();
        System.out.println("ENTER THE STREET:\t");
        street = in.nextLine();
        System.out.println("ËNTER THE STATE:\t");
        state = in.nextLine();
// TODO implement here
        return null;
    }

    /**
     * @return
     */
    public void display() {
        System.out.println("\n\tTHE DETAILS ARE..");
        System.out.println(housename+"\n"+street+"\n"+city+"\n"+state);
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public String getcountry();

}
