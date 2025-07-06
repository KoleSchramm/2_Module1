import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String firstname = "";
        String lastName = "";
        int accountID = 0;
        String input = "";
        Scanner scan = new Scanner(System.in);

        //Testing BankAccount
        BankAccount bankAccount = new BankAccount("Kole", "Schramm", 3456745);
        bankAccount.deposit(53723.98);
        bankAccount.accountSummary();

        bankAccount.withdrawal(456.93);
        bankAccount.accountSummary();

        bankAccount.setFirstName("Jimmy");
        bankAccount.setLastName("Buffett");
        bankAccount.setAccountID(1038460183);
        bankAccount.accountSummary();

        System.out.println();
        System.out.println(bankAccount.getAccountID());
        System.out.println(bankAccount.getBalance());
        System.out.println(bankAccount.getFirstName());
        System.out.println(bankAccount.getLastName());
        System.out.println();

        //Testing CheckingAccount
        CheckingAccount checkingAccount = new CheckingAccount("Kole", "Schramm", 91326460);
        checkingAccount.deposit(29383.65);
        checkingAccount.withdrawal(192628.45);
        checkingAccount.processWithdrawal();
        checkingAccount.displayAccount();

        //Custom CheckingAccount
        System.out.println("Input first name: ");
        firstname = scan.next();
        System.out.println("Input last name: ");
        lastName = scan.next();
        System.out.println("Input account ID: ");
        accountID = scan.nextInt();

        CheckingAccount customAccount = new CheckingAccount(firstname,lastName,accountID);
        System.out.println("Account created.");

        while (!input.equalsIgnoreCase("end")){
            System.out.println(String.format("Your balance is: $%.2f",customAccount.balance));
            System.out.println("Deposit, Withdraw, or End");
            input = scan.next();

            if(input.equalsIgnoreCase("Deposit")){
                System.out.println("Input an amount to deposit: ");
                customAccount.deposit(scan.nextDouble());
            }
            else if (input.equalsIgnoreCase("Withdraw")){
                System.out.println("Input an amount to withdraw: ");
                customAccount.withdrawal(scan.nextDouble());
                customAccount.processWithdrawal();
            }
            else if (!input.equalsIgnoreCase("End")){
                System.out.println("Unknown input.");
            }
        }
    }
}