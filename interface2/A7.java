package interface2;

/**
 *
 * @author Md. Sohel Rana, ID: 172452574
 */
class A7 implements Printable, Showable {

    public void print() {
        System.out.println("Hello");
    }

    public void show() {
        System.out.println("Welcome");
    }

    public static void main(String args[]) {
        A7 obj = new A7();
        obj.print();
        obj.show();
    }
}