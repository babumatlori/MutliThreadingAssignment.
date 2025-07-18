package Download;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> Dataa = new ArrayList<Integer>();

        DownloadThread d1 = new DownloadThread(Dataa,1000);
        PlayerThread p1 = new PlayerThread(Dataa,500);
        d1.start();
        p1.start();
    }
}
