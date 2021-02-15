package springConfTest;

import java.text.DateFormat;
import java.util.Date;

public class Event {
    private final int id = count++;
    private static int count = 0;
    private String msg;
    private Date date;
    private DateFormat dateFormat;

    public Event(Date date, DateFormat dateFormat) {
        this.date = date;
        this.dateFormat = dateFormat;
    }

    public Event() {
    }

    public int getId() {
        return id;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return id + ") " + msg + " - " + dateFormat.format(date);
    }
}
