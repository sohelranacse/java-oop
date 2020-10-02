package access_modifier_default;
import access_modifier_private.*;

/**
 *
 * @author Md. Sohel Rana, ID: 172452574
 */

class B {

    public static void main(String args[]) {
        A obj = new A();
        //Compile Time Error
        obj.msg();
        //Compile Time Error
        
        // the scope of class A and its method msg() is default so it cannot be accessed from outside the package.
    }
}