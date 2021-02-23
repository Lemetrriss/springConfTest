package springConfTest.loggers;

import org.springframework.stereotype.Component;
import springConfTest.pojo.Event;

@Component
public class ConsoleEventLogger implements EventLogger{
    @Override
    public void logEvent(Event msg) {
        System.out.println(msg);
    }
}
