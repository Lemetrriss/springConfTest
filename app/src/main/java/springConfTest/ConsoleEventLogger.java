package springConfTest;

import org.springframework.stereotype.Component;

@Component
public class ConsoleEventLogger implements EventLogger{
    @Override
    public void logEvent(Event msg) {
        System.out.println(msg);
    }
}
