package al.polis.calc01.controller;

import al.polis.calc01.dto.RequestDto;
import al.polis.calc01.dto.ResultDto;
import al.polis.calc01.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController // makes the class a "controller" able to receive http requests
public class CalculatorController {

    @Autowired
    CalculatorService calculatorService;

    // each method will "map" an http request
    @GetMapping("/greet-me")
    public String hello() {
        return "<html><head></head><body><h1>Hello client, Si je?</h1></body></html>";
    }

    @PostMapping("/sum")
    @ResponseBody
    public ResultDto sum(@RequestBody RequestDto dto) {
        System.out.println("Entered the controller");
        // calculate the sum
        //double r = dto.getOp1() + dto.getOp2();
        double r = calculatorService.sum(dto.getOp1(), dto.getOp2());

        // return the resul as a DTO
        ResultDto res = new ResultDto();
        res.setResult(r);
        System.out.println("Exiting the controller");
        return res;
    }
}
