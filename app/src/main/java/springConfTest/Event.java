package springConfTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.text.DateFormat;
import java.util.Date;

@Component
public class Event {
    private final int id = count++;
    private static int count = 0;
    private String msg;
    private Date date;
    private DateFormat dateFormat;

    @Autowired
    public void setDate(Date date) {
        this.date = date;
    }
    @Autowired
    public void setDateFormat(DateFormat dateFormat) {
        this.dateFormat = dateFormat;
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
