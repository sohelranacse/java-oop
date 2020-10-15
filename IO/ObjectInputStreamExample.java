package java_input_output;

import java.io.*;

/**
 *
 * @Md. Sohel Rana, 172452574
 */
public class ObjectInputStreamExample {

    public static class Person implements Serializable {

        public String name = null;
        public int age = 0;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("D:\\testout.txt"));
        Person person = new Person();
        person.name = "Sohel Rana";
        person.age = 25;
        objectOutputStream.writeObject(person);
        objectOutputStream.close();
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("D:\\testout.txt"));
        Person personRead = (Person) objectInputStream.readObject();
        objectInputStream.close();
        System.out.println(personRead.name);
        System.out.println(personRead.age);
    }
}
