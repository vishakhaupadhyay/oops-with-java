class BankAccount {
    int balance = 500;

    synchronized void withdraw(int amount) {
        while (balance < amount) {
            try {
                System.out.println("Insufficient balance. Waiting...");
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }

        balance = balance - amount;
       
        System.out.println("withdrawal successful: " + balance);
    }

    synchronized void deposit(int amount) {
        balance = balance + amount;
        System.out.println("Deposited: " + amount);
        notify();
    }
}

class WithdrawThread implements  Runnable {
    BankAccount account; //reference

    WithdrawThread(BankAccount account) {   //initialize  //constructor
        this.account = account;
    }
//override
    public void run() {
        account.withdraw(700);
    }
}

class DepositThread implements Runnable {
    BankAccount account;

    DepositThread(BankAccount account) {  //constructor
        this.account = account;
    }

    public void run() {
        account.deposit(500);
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        WithdrawThread t1 = new WithdrawThread(account);
        DepositThread t2 = new DepositThread(account);

        t1.start();
        t2.start();
    }
}