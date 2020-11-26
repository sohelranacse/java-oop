package lecture4;

import java.util.Iterator;
import java.util.LinkedHashSet;

/**
 *
 * @author user
 */
public class LinkedHashSetExm {

    public static void main(String args[]) {
        LinkedHashSet<String> set = new LinkedHashSet<String>();
        set.add("Compton");
        set.add("Carberry");
        set.add("Billings");
        set.add("Prior");
        Iterator<String> itr = set.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
