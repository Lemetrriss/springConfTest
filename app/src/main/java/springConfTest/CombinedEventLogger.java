package springConfTest;

import java.util.List;

public class CombinedEventLogger implements EventLogger{
    List<EventLogger> logesrs;

    public CombinedEventLogger(List<EventLogger> loggesrs) {
        this.logesrs = loggesrs;
    }

    @Override
    public void logEvent(Event msg) {
        logesrs.forEach(l -> l.logEvent(msg));
    }
}
