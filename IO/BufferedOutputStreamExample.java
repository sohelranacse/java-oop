package java_input_output;

import java.io.*;

/**
 *
 * @Md. Sohel Rana, 172452574
 */
public class BufferedOutputStreamExample {

    public static void main(String args[]) throws Exception {
        FileOutputStream fout = new FileOutputStream("D:\\testout.txt");
        BufferedOutputStream bout = new BufferedOutputStream(fout);
        String s = "Welcome to City University.";
        byte b[] = s.getBytes();
        bout.write(b);
        bout.flush();
        bout.close();
        fout.close();
        System.out.println("success");
    }

}
