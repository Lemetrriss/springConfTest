package springConfTest;

import java.io.*;

public class FileEventLogger implements EventLogger{

    private final String filename;

    public FileEventLogger(String filename) {
        this.filename = filename;
    }

    private boolean canWrite() {
        return new File(filename).canWrite();
    }

    @Override
    public void logEvent(Event event) {
        try (FileWriter pr = new FileWriter(filename, true)){
            pr.write(event.toString() + "\n");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
