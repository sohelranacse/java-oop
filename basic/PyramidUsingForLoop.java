package lectureone;

/**
 * Name: Md. Sohel Rana, ID: 172452574
 */
public class PyramidUsingForLoop {

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();//new line
        }
    }
}
