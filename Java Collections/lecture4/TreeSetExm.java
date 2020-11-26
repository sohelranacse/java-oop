package lecture4;

import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * @author user
 */
public class TreeSetExm {

    public static void main(String args[]) {
        //Creating and adding elements
        TreeSet<String> set = new TreeSet<String>();
        set.add("Giles");
        set.add("Jimmy");
        set.add("Hoggard");
        set.add("Nixon");
        //traversing elements
        Iterator<String> itr = set.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
