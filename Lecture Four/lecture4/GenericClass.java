package lecture4;

/**
 *
 * @author user
 */
public class GenericClass {

    public static void main(String args[]) {
        MyGen<Integer> m = new MyGen<Integer>();
        m.add(2);
        //m.add("vivek");//Compile time error
        System.out.println(m.get());
    }
}
