package Download;

import jdk.dynalink.linker.LinkerServices;

import java.util.List;

public class DownloadThread extends Thread{

    private List<Integer> data;
    private int speed;

    public DownloadThread(List<Integer> data, int speed) {
        this.data = data;
        this.speed = speed;
    }

    @Override
    public void run() {
        int i;
        for (i=1;i<=10;i++){
            synchronized (data){
                data.add(i);

                System.out.println("Download: "+i);
                data.notify();
                try {
                    Thread.sleep(speed);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
