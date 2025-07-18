package EvenAndOdd;

public class EvenTheard extends Thread{
    private PrintNumber eN;

    public EvenTheard(PrintNumber eN) {
        this.eN = eN;
    }

    @Override
    public void run() {
        eN.printEven();
    }
}
