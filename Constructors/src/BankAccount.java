

public class BankAccount {

    private  String accountNumber;
    private double accountBalance;
    private String customerName;
    private String email;
    private long phoneNumber;

// Constructor is a special member function that is called automatically whenever the object of the class is created.
//  Constructors are used to initialize the instance(Object) variables.

    public BankAccount(){
        System.out.println("Empty Constructor is Called Here.....");
    }

    public BankAccount(String accountNumber, double accountBalance, String customerName, String email, long phoneNumber ){
        this.accountBalance = accountBalance;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }


    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return accountBalance;
    }

    public void setBalance(double balance) {
        this.accountBalance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(double addFunds){
        System.out.println("Initial balance in the account  was "+accountBalance);
        this.accountBalance +=  addFunds;
        System.out.println("deposited money = "+addFunds);
        System.out.println("Current balance is "+accountBalance);

    }

    public void withdrawFunds(double removeFunds){
        if((accountBalance - removeFunds) < 0)
            System.out.println("Insufficient Funds in the account to withdraw.");
        else if((accountBalance - removeFunds) < 100)
            System.out.println("Low Balance in the account.");
        else{
            this.accountBalance -= removeFunds;
            System.out.println("amount credited is "+removeFunds);
            System.out.println("Current balance is "+accountBalance);
        }

    }



}
