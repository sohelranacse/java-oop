package encapsulation;

/**
 *
 * @author Md. Sohel Rana, ID: 172452574
 */
class encapsulation {

    public static void main(String[] args) {
        //creating instance of the encapsulated class
        Student s = new Student();
        //setting value in the name member
        s.setName("Sohel");
        //getting value of the name member
        System.out.println(s.getName());
    }
}
