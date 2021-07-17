package digitalClock;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ClockThread extends Thread {

    ClockMain dc;
    String time;

    public ClockThread(ClockMain dc) {
        this.dc = dc;
        start();
    }
    public void run() {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        while(true) {
            Calendar cal = Calendar.getInstance();
            time = "" + sdf.format(cal.getTime());
            dc.jlabClock.setText(time);
        }
    }
}
