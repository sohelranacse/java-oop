package java_input_output;

import java.io.FileInputStream;

/**
 *
 * @Md. Sohel Rana, 172452574
 */
public class FileInputStreamExample {

    public static void main(String args[]) {
        try {
            FileInputStream fin = new FileInputStream("D:\\testout.txt");
            int i = 0;
            while ((i = fin.read()) != -1) {
                System.out.print((char) i);
            }
            fin.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
