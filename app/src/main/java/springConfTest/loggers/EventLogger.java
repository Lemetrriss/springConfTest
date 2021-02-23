package springConfTest.loggers;

import springConfTest.pojo.Event;

public interface EventLogger {
    void logEvent(Event msg);
}
