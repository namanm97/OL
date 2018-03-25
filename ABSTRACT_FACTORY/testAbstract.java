
import java.util.*;

/**
 * 
 */
public class testAbstract {
    public static void main(String args[]) {
        UscontactFactory nameusa = new UscontactFactory();
        IncontactFactory nameind = new IncontactFactory();
        System.out.println("ENTER THE AMERICAN ADDRESS AND PHONE NUMBER:\t");
        nameusa.createAddr();
        nameusa.createPhno();
        System.out.println("ENTER THE INDIAN ADDRESS AND PHONE NUMBER:\t");
        nameind.createAddr();
        nameind.createPhno();
    }
}
