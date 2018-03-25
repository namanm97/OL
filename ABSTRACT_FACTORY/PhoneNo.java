
import java.util.*;

/**
 * 
 */
public abstract class PhoneNo {

    /**
     * Default constructor
     */
    public PhoneNo() {
    }

    /**
     * 
     */
    public long pnum;

    /**
     * @return
     */
    public void getnum() {
        Scanner in=new Scanner(System.in);
        System.out.println("ENTER THE PHONENUM:\t");
        pnum=in.nextLong();// TODO implement here    }

    /**
     * @return
     */
    public void displaynum() {
        System.out.println("\n\tTHE PHONENUMBER IS..");
        System.out.println(pnum);// TODO implement here    }

    /**
     * @return
     */
    public int getlen(){}

}
