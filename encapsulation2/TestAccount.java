package encapsulation2;

/**
 *
 * @author Md. Sohel Rana, ID: 172452574
 */
public class TestAccount {

    public static void main(String[] args) {
        //creating instance of Account class
        Account acc = new Account();
        //setting values through setter methods 
        acc.setAcc_no(7560504000L);
        acc.setName("Sohel Rana");
        acc.setEmail("mdsohelranacse@gmail.com");
        acc.setAmount(500000f);
        //getting values through getter methods
        System.out.println(acc.getAcc_no() + "\n" + acc.getName() + "\n" + acc.getEmail() + "\n" + acc.getAmount());
    }
}
