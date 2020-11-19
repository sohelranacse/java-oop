package lecture4;

import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author user
 */
public class LinkedListExm {

    public static void main(String args[]) {
        LinkedList<String> al = new LinkedList<String>();
        al.add("Roy");
        al.add("Bairstow");
        al.add("Root");
        al.add("Morgan");
        Iterator<String> itr = al.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
