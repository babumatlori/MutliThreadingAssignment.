package Download;

import java.util.List;

public class PlayerThread extends  Thread{
    private List<Integer> data;
    private  int speed;
    private int count=0;

    public PlayerThread(List<Integer> data, int speed) {
        this.data = data;
        this.speed = speed;
    }

    @Override
    public void run() {
        while (count<10){
            synchronized (data){
                while (data.isEmpty()){
                    try {
                        data.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                int value= data.remove(0);
                System.out.println(" Playing "+value);
                count++;
                try {
                    Thread.sleep(speed);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
