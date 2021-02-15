package springConfTest;

import java.util.ArrayList;
import java.util.List;

public class CacheFileEventLogger extends FileEventLogger{

    private final List<Event> events = new ArrayList<>();
    private final int size;

    public CacheFileEventLogger(String filename, int size) {
        super(filename);
        this.size = size;
    }

    @Override
    public void logEvent(Event event) {
        events.add(event);
        if (events.size() == size){
            writeToFile();
        }
    }

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
