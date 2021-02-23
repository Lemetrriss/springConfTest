package springConfTest.springConfigClass;

import org.springframework.context.annotation.*;
import springConfTest.enums.EventType;
import springConfTest.loggers.CombinedEventLogger;
import springConfTest.loggers.ConsoleEventLogger;
import springConfTest.loggers.EventLogger;
import springConfTest.loggers.FileEventLogger;

import java.text.DateFormat;
import java.util.*;

@Configuration
@ComponentScan("springConfTest")
@PropertySource("classpath:propertya.properties")
public class AppConfig {

    @Bean
    public Map<EventType, EventLogger> typemap(ConsoleEventLogger consoleEventLogger, CombinedEventLogger combinedEventLogger) {
        Map<EventType, EventLogger> map = new HashMap<>();
        map.put(EventType.INFO, consoleEventLogger);
        map.put(EventType.ERROR, combinedEventLogger);
        return map;
    }

    @Bean
    public List<EventLogger> loggerList(ConsoleEventLogger consoleEventLogger, FileEventLogger fileEventLogger) {
        ArrayList<EventLogger> list = new ArrayList<>();
        list.add(consoleEventLogger);
        list.add(fileEventLogger);
        return list;
    }

    @Bean
    @Scope("prototype")
    public Date currentDate() {
        return new Date();
    }

    @Bean
    public DateFormat dateFormat() {
        return DateFormat.getDateTimeInstance(3, 3);
    }
}
