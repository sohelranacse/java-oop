package lecture4;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class GetAndSetArrayList {

    public static void main(String args[]) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("Mango");
        al.add("Apple");
        al.add("Banana");
        al.add("Grapes");
        //accessing the element
        System.out.println("Returning element: " + al.get(1));
        //it will return the 2nd element, because index starts from 0
        //changing the element
        al.set(1, "Dates");
        //Traversing list
        for (String fruit : al) {
            System.out.println(fruit);
        }

    }
}
