package lecture4;

import java.util.Iterator;
import java.util.Vector;

/**
 *
 * @author user
 */
public class VectorExm {

    public static void main(String args[]) {
        Vector<String> v = new Vector<String>();
        v.add("Sam");
        v.add("Tom");
        v.add("Woakes");
        v.add("Jofra");
        Iterator<String> itr = v.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
