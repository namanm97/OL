
import java.util.*;

/**
 * 
 */
public class summarizeOrganisation implements summarizeStrategy {

    /**
     * Default constructor
     */
    public summarizeOrganisation() {
    }

    /**
     * @param a 
     * @return
     */
    public void summarize(List<contact> a) {
        System.out.println("Summerize by organizastion");
        Collections.sort(a, new Comparator<Contact>(){
            public int compare(Contact o1, Contact o2){
                return o1.company.compareTo(o2.company);
            }
        });
        System.out.println(Arrays.asList(a));	
    }
}
