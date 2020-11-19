package lecture4;

import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author user
 */
public class HashSetExm {

    public static void main(String args[]) {
        //Creating HashSet and adding elements
        HashSet<String> set = new HashSet<String>();
        set.add("Cook");
        set.add("Pietersen");
        set.add("Trott");
        set.add("Bell");
        //Traversing elements
        Iterator<String> itr = set.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
