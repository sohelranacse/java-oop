package interface1;

/**
 *
 * @author Md. Sohel Rana, ID: 172452574
 */
class A6 implements printable {

    public void print() {
        System.out.println("Hello");
    }

    public static void main(String args[]) {
        A6 obj = new A6();
        obj.print();
    }
}
