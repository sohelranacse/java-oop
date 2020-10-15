package java_input_output;

import java.io.FileOutputStream;

/**
 *
 * @Md. Sohel Rana, 172452574
 */
public class FileOutputStreamExample {

    public static void main(String args[]) {
        try {
            FileOutputStream fout = new FileOutputStream("D:\\testout.txt");
            String s = "Welcome to City University.";
            byte b[] = s.getBytes();//converting string into byte array
            fout.write(b);
            fout.close();
            System.out.println("success...");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
