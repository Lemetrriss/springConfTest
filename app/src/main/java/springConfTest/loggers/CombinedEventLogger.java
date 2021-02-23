package springConfTest.loggers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import springConfTest.pojo.Event;

import java.util.List;

@Component
public class CombinedEventLogger implements EventLogger{

    List<EventLogger> logesrs;

    @Autowired
    public CombinedEventLogger(@Qualifier("loggerList")List<EventLogger> loggesrs) {
        this.logesrs = loggesrs;
    }

    @Override
    public void logEvent(Event msg) {
        logesrs.forEach(l -> l.logEvent(msg));
    }
}
