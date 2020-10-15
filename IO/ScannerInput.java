package java_input_output;

import java.util.*;

/**
 *
 * @Md. Sohel Rana, 172452574
 */
public class ScannerInput {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = in.nextLine();
        System.out.println("Name is: " + name);
        in.close();
    }
}
