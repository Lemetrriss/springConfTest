package springConfTest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Client {
    @Value("${id}")
    private int id;
    @Value("${name}")
    private String name;
    @Value("${greeting}")
    private String greetimg;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGreetimg() {
        return greetimg;
    }
}
