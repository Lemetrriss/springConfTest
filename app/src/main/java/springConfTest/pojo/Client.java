package springConfTest.pojo;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Getter
@Component
@Scope("prototype")
public class Client {
    @Value("${id}")
    private int id;
    @Value("${name}")
    private String name;
    @Value("${greeting}")
    private String greetimg;
}