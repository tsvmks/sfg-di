package tsvmks.springframework.sfgdi.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String sayHello() {
        System.out.printf("Hello, world!!!");

        return "Hi Folks!";
    }
}
