package java_input_output;

import java.io.*;

/**
 *
 * @Md. Sohel Rana, 172452574
 */
public class DataInputStreamExample {
    
    public static void main(String[] args) throws FileNotFoundException,
    IOException {
        InputStream input = new FileInputStream("D:\\testout.txt");
        DataInputStream inst = new DataInputStream(input);
        int count = input.available();
        byte[] ary = new byte[count];

        inst.read (ary);
        for (byte bt : ary) {
        char k = (char) bt;
            System.out.print(k + "-");
        }
    }
}
