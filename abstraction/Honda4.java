package abstraction;

/**
 *
 * @author Md. Sohel Rana, ID: 172452574
 */
class Honda4 extends Bike {

    void run() {
        System.out.println("running safely");
    }

    public static void main(String args[]) {
        Bike obj = new Honda4();
        obj.run();
    }
}
