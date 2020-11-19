/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparator_example;
import java.util.*;

/**
 *
 * @author user
 */

public class TestSort1 {

    public static void main(String args[]) {
        ArrayList<Student> al = new ArrayList<Student>();
        al.add(new Student(101, "Vijay", 23));
        al.add(new Student(106, "Ajay", 27));
        al.add(new Student(105, "Jai", 21));
        // Sorting elements on the basis of name
        Comparator<Student> cm1 = Comparator.comparing(Student::getName);
        Collections.sort(al, cm1);
        System.out.println("Sorting by Name");
        for (Student st : al) {
            System.out.println(st.rollno + " " + st.name + " " + st.age);
        }
        //Sorting elements on the basis of age
        Comparator<Student> cm2 = Comparator.comparing(Student::getAge);
        Collections.sort(al, cm2);
        System.out.println("Sorting by Age");
        for (Student st : al) {
            System.out.println(st.rollno + " " + st.name + " " + st.age);
        }
    }
}
