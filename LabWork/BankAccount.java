public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);

        Customer c1 = new Customer(account, "deposit", 500);
        Customer c2 = new Customer(account, "withdraw", 200);
        Customer c3 = new Customer(account, "withdraw", 1500);

        c1.setName("Customer-1");
        c2.setName("Customer-2");
        c3.setName("Customer-3");

        c1.start();
        c2.start();
        c3.start();
    }
}
class BankAccount {
    private int balance;

    public BankAccount(int initialBalance) {
        this.balance = initialBalance;
    }

    public synchronized void deposit(int amount) {
        balance += amount;
        System.out.println(Thread.currentThread().getName() + " deposited " + amount + ". New balance: " + balance);
    }

    public synchronized void withdraw(int amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " withdrew " + amount + ". New balance: " + balance);
        } else {
            System.out.println(Thread.currentThread().getName() + " tried to withdraw " + amount + " but insufficient funds. Current balance: " + balance);
        }
    }

    public int getBalance() {
        return balance;
    }
}
class Customer extends Thread {
    private BankAccount account;
    private String transactionType;
    private int amount;

    public Customer(BankAccount account, String transactionType, int amount) {
        this.account = account;
        this.transactionType = transactionType;
        this.amount = amount;
    }

    @Override
    public void run() {
        if ("deposit".equalsIgnoreCase(transactionType)) {
            account.deposit(amount);
        } else if ("withdraw".equalsIgnoreCase(transactionType)) {
            account.withdraw(amount);
        } else {
            System.out.println("Invalid transaction type: " + transactionType);
        }
    }
}

