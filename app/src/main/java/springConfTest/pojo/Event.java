package springConfTest.pojo;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.text.DateFormat;
import java.util.Date;

@Component
public class Event {
    private final int id = count++;
    private static int count = 0;
    @Getter
    @Setter
    private String msg;
    @Getter
    @Setter
    @Autowired
    private Date date;
    @Autowired
    private DateFormat dateFormat;

    @Override
    public String toString() {
        return id + ") " + msg + " - " + dateFormat.format(date);
    }
}
