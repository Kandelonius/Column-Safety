package digitalClock;

import java.util.Date;

public class ClockThread extends Thread {

    ClockMain dc;
    String time;

    public ClockThread(ClockMain dc) {
        this.dc = dc;
        start();
    }
    public void run() {
        while(true) {
            time = "" + new Date();
            dc.jlabClock.setText(time);
        }
    }
}
