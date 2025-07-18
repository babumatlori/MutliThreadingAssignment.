package EvenAndOdd;

public class OddThread extends Thread{
    private PrintNumber pN;

    public OddThread(PrintNumber pN) {
        this.pN = pN;
    }

    @Override
    public void run() {
        pN.printOdd();

    }
}
