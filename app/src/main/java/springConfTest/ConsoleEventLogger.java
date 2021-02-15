package springConfTest;

import org.springframework.core.task.TaskDecorator;

public class ConsoleEventLogger implements EventLogger{
    @Override
    public void logEvent(Event msg) {
        System.out.println(msg);
    }
}
