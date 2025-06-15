public class BankAccount {
    String firstName;
    String lastName;
    int accountID;
    double balance;

    //Constructors
    BankAccount(){
        firstName = "";
        lastName = "";
        accountID = 0;
        balance = 0;
    }

    BankAccount(String firstName, String lastName, int accountID){
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountID = accountID;
        this.balance = 0;
    }

    //Deposit and withdrawal
    public void deposit(double amount){
        balance += amount;
    }

    public void withdrawal(double amount){
        balance -= amount;
    }

    //Setters
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setAccountID(int accountID){
        this.accountID = accountID;
    }

    //Getters
    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public int getAccountID(){
        return this.accountID;
    }

    public double getBalance(){
        return this.balance;
    }

    //Account Summary
    public void accountSummary(){
        System.out.println();
        System.out.println("Name: " + this.firstName + " " + this.lastName);
        System.out.println("Account ID: " + this.accountID);
        System.out.println(String.format("Balance: $%.2f", this.balance));
    }

}
