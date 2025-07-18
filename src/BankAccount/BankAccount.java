package BankAccount;

public class BankAccount {
    private int bal;

    public BankAccount(int bal) {
        this.bal = bal;
    }

    public synchronized void deposit(int amount, String name){
        bal-=amount;
        System.out.println(name+" deposit: "+amount+" Bal: "+bal);
        System.out.println();
    }

    public synchronized void Withdraw(int amount, String name){
        if (bal>=amount){
            bal-=amount;
            System.out.println(name+" WithDraw: "+amount+" Bal: "+bal+" ");
        }else {
            System.out.println("NO balance ");
        }
    }

    public synchronized int Balance(){
        return bal;
    }
}
