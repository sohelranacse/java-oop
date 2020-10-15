package java_input_output;

import java.io.*;

/**
 *
 * @Md. Sohel Rana, 172452574
 */
public class DataOutputStreamexample {

    public static void main(String[] args) throws IOException {
        FileOutputStream file = new FileOutputStream("D:\\testout.txt");
        DataOutputStream data = new DataOutputStream(file);
        data.writeInt(65);
        data.flush();
        data.close();
        System.out.println("Succcess...");
    }
}