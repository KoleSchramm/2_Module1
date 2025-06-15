public class Main {
    public static void main(String[] args) {
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
    }
}