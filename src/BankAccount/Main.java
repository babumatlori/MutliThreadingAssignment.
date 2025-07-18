package BankAccount;

public class Main {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount(50000);
        Thread t1 = new Transaction(b1,true,10000,"BABU");
        Thread t2 = new Transaction(b1,false,50000,"Babu");

        t2.start();
        t1.start();
    }
}
