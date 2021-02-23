package springConfTest.loggers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import springConfTest.pojo.Event;

import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;

@Component
@Lazy
public class CacheFileEventLogger extends FileEventLogger{

    private final List<Event> events = new ArrayList<>();

    @Value("${size}")
    private int size;

    @Override
    public void logEvent(Event event) {
        events.add(event);
        if (events.size() == size){
            writeToFile();
        }
    }

    @PreDestroy
    private void destroy(){
        if (events.size() != 0){
            writeToFile();
            System.out.println("destriy method");
        }
    }

    private void writeToFile() {
        events.forEach(super::logEvent);
        events.clear();
    }
}
