
public class ConstructorsPartTwo {

    public static void main(String[] args) {

        Account ac = new Account("HA-9906920536",300,"Harish Prasad","harish@gmail.com",6983245168L);
// Above is the code statement which is used to initialize instance variables using constructors.


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

        ac.depositFunds(1000);
        ac.withdrawFunds(350);

        Account sc = new Account("Robert","robert@gmail.com",6598632412L);
        System.out.println(sc.getCustomerName());
        System.out.println(sc.getAccountNumber());
        System.out.println(sc.getEmail());

    }

    }

