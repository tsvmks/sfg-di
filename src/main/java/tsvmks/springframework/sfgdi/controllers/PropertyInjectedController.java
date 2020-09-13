package tsvmks.springframework.sfgdi.controllers;

import tsvmks.springframework.sfgdi.services.GreetingService;

public class PropertyInjectedController {

    public GreetingService greetingService;

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
