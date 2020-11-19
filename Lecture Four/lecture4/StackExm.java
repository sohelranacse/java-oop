package lecture4;

import java.util.Iterator;
import java.util.Stack;

/**
 *
 * @author user
 */
public class StackExm {

    public static void main(String args[]) {
        Stack<String> stack = new Stack<String>();
        stack.push("Plunket");
        stack.push("Rashid");
        stack.push("Moeen");
        stack.push("Wood");
        stack.push("Anderson");
        stack.pop();
        Iterator<String> itr = stack.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
