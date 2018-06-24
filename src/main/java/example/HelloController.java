package example;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

import javax.inject.Inject;

@Controller("/")
public class HelloController {

    @Inject
    private HelloService service;

    @Get("/hello")
    public Message hello() {
        return new Message(service.hello());
    }

    @Get("/hello/{name}")
    public Message hello(String name) {
        return new Message(service.hello(name));
    }

}
