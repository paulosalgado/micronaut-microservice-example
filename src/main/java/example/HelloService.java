package example;

import io.micronaut.validation.Validated;

import javax.inject.Singleton;
import javax.validation.constraints.NotBlank;

@Singleton
@Validated
public class HelloService {

    public String hello() {
        return "Hello World!";
    }

    public String hello(@NotBlank String name) {
        return "Hello " + name + "!";
    }

}
