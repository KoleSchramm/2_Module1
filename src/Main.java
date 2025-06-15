public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Kole", "Schramm", 2345678 );
        account.deposit(5.67);
        account.accountSummary();
    }
}