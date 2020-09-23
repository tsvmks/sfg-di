package tsvmks.springframework.sfgdi.controllers;

import org.springframework.stereotype.Controller;
import tsvmks.springframework.sfgdi.services.GreetingService;

@Controller
public class MyController {
    private GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
