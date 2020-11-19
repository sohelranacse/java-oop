package lecture4;

/**
 *
 * @author user
 */
import java.util.*;

class ArrayListExm {

    public static void main(String args[]) {
        ArrayList<String> list = new ArrayList<String>(); //Creating arraylist
        list.add("Ben");//Adding object in arraylist
        list.add("Buttler");
        list.add("Broad");
        list.add("Bopara");
        //Traversing list through Iterator
        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
