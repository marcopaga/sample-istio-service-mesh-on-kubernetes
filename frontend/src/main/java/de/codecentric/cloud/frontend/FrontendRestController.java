package de.codecentric.cloud.frontend;

import java.util.Random;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FrontendRestController {

    @Resource
    private Calculation calculation;

    @GetMapping("/")
    public String calculate(){
        final Random random = new Random();
        int first = random.nextInt();
        int second = random.nextInt();

        return calculation.performAddition(first, second);
    }

    @GetMapping("/calculate/{first}/{second}")
    public String calculate(@PathVariable("first") int first, @PathVariable("second") int second){
        return calculation.performAddition(first, second);
    }

}
