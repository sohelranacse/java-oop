package lecture4;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 *
 * @author user
 */
public class DequeInterface {

    public static void main(String[] args) {
        //Creating Deque and adding elements
        Deque<String> deque = new ArrayDeque<String>();
        deque.add("Collingwood");
        deque.add("Flintoff");
        deque.add("Strauss");
        //Traversing elements
        for (String str : deque) {
            System.out.println(str);
        }
    }
}
