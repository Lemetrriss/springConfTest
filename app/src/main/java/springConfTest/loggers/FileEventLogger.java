package springConfTest.loggers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import springConfTest.pojo.Event;

import javax.annotation.PostConstruct;
import java.io.*;

@Component
public class FileEventLogger implements EventLogger{

    @Value("${log}")
    private String filename;

    @PostConstruct
    private void canWrite() throws FileNotFoundException {
        if (!new File(filename).canWrite())
            throw new FileNotFoundException("Unable to write into file " + filename);
    }

    @Override
    public void logEvent(Event event) {
        try (FileWriter pr = new FileWriter(filename, true)){
            pr.write(event.toString() + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
