public class BankAccountSimulation {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);

        Runnable user1 = () -> {
            account.deposit(500);
            account.withdraw(700);
        };

        Runnable user2 = () -> {
            account.deposit(200);
            account.withdraw(1000);
        };

        // Multiple threads representing different users
        Thread t1 = new Thread(user1);
        Thread t2 = new Thread(user2);

        t1.start();
        t2.start();
    }
}
