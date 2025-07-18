package EvenAndOdd;

public class PrintNumber {
    private int number;
    private int max;

    public PrintNumber(int number, int max) {
        this.number = number;
        this.max = max;
    }

    public synchronized void printOdd(){
        while (number<=max){
            if (number%2==1){
                System.out.println("odd: "+number);
                number++;
                notify();
            }else {
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public synchronized void printEven(){
        while (number<=max){
            if (number%2==0){
                System.out.println("Even: "+number);
                number++;
                notify();
            }else {
//                System.out.println("error occ");
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
