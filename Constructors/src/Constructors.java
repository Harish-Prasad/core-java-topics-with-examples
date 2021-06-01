
public class Constructors {
    public static void main(String[] args) {


        BankAccount sc = new BankAccount("HA-9906920536",300,"Harish Prasad","harish@gmail.com",6983245168L);
// Above is the code statement which is used to initialize instance variables using constructors.

        BankAccount ac = new BankAccount();
        ac.setAccountNumber("HA-9906920536");
        ac.setCustomerName("Harish Prasad");
        ac.setEmail("harish@gmail.com");
        ac.setPhoneNumber(7676787259L);

        System.out.println();
        System.out.println("Account Number: "+ac.getAccountNumber());
        System.out.println("Customer Name: "+ac.getCustomerName());
        System.out.println("E-mail: "+ac.getEmail());
        System.out.println("Phone Number: "+ac.getPhoneNumber());
        System.out.println("Current Account Balance: "+ac.getBalance());

        ac.setBalance(200);
        System.out.println();
        System.out.println("**********************************************************");
        System.out.println();
        System.out.println("Initial amount deposited successfully.");
        System.out.println("Current Balance: "+ac.getBalance());

        ac.depositFunds(300);
        ac.withdrawFunds(50);

    }
}
