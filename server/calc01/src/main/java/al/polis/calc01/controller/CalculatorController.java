package al.polis.calc01.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // makes the class a "controller" able to receive http requests
public class CalculatorController {
    // each method will "map" an http request
    @GetMapping("/greet-me")
    public String hello(){
        return "<html><head></head><body><h1>Hello client, Si je?</h1></body></html>";
    }
}
