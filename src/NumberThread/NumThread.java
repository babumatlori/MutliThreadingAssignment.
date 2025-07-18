package NumberThread;

public class NumThread extends Thread {
    private int start;
    private int stop;
    private  int delay;

    public NumThread(int start, int stop, int delay) {
        this.start = start;
        this.stop = stop;
        this.delay = delay;
    }

    @Override
    public void run() {
        int i;
        for (i=start;i<=stop;i++){
            System.out.println("NUmber "+i);
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
