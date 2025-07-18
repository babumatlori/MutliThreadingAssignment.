package EvenAndOdd;

public class Main {
    public static void main(String[] args) {
        PrintNumber p1= new PrintNumber(1,10);
        EvenTheard e1= new EvenTheard(p1);
        OddThread o1= new OddThread(p1);

        e1.start();
        o1.start();

    }
}
