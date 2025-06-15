public class CheckingAccount extends BankAccount{
    double interest;

    CheckingAccount(String firstName, String lastName, int accountID){
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountID = accountID;
        this.balance = 0;
        this.interest = 0.01;
    }

    public void processWithdrawal(){
        if(this.balance<0){
            this.balance -= 30;
            System.out.println("A $30 overdraft fee has been charged to your account.");
            System.out.println(String.format("Your new balance is: $%.2f", balance));
        }
    }

    public void displayAccount(){
        this.accountSummary();
        System.out.println(String.format("Interest: %.2f", this.interest));
    }

}
