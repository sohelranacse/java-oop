package access_modifier_private;

/**
 *
 * @author Md. Sohel Rana, ID: 172452574
 */
public class Simple {

    public static void main(String args[]) {
        A obj = new A();
        System.out.println(obj.data);
        //Compile Time Error, cause data variabel is private
        obj.msg();
        //Compile Time Error, cause msg() function is private
    }
}
