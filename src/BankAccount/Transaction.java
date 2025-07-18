package BankAccount;

public class Transaction extends Thread{
    private BankAccount account;
    private boolean isDeposit;
    private int amount;
    private String name;

    public Transaction(BankAccount account, boolean Deposit, int amount, String name) {
        this.account = account;
        this.isDeposit = Deposit;
        this.amount = amount;
        this.name = name;
    }

    @Override
    public void run() {
        if (isDeposit){
            account.deposit(amount,name);
        }else {
            account.Withdraw(amount,name);
        }
    }
}
