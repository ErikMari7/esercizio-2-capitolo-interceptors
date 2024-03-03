package co.develhope.esercizio2.interceptor.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {
    @GetMapping("")
    public String welcomeMessage(){
        return "Welcome!";
    }
}
