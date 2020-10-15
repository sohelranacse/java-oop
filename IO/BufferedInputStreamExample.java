package java_input_output;
import java.io.*;

/**
 *
 * @Md. Sohel Rana, 172452574
 */
public class BufferedInputStreamExample {

    public static void main(String args[]) {
        try {
            FileInputStream fin = new FileInputStream("D:\\testout.txt");
            BufferedInputStream bin = new BufferedInputStream(fin);
            int i;
            while ((i = bin.read()) != -1) {
                System.out.print((char) i);
            }
            bin.close();
            fin.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
