
import java.util.*;

/**
 * 
 */
public class contactList {
    SummerizeStrategy s;

    /**
     * Default constructor
     */
    public ContactList(SummerizeStrategy s){
        this.s = s;
    }


    /**
     * @param a 
     * @return
     */
    public void doSummarize(List<contact> a) {
        s.summarize(a);
    }
}
