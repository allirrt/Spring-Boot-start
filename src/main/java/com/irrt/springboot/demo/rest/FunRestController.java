package com.irrt.springboot.demo.rest;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import java.time.LocalDateTime;

@RestController
public class FunRestController {

    @Value("${coach.name}")
    private String coachName; //=Mike Yellow
    @Value("${team.name}")
    private String teamName; //=The Crazy House

    @GetMapping("teaminfo")
    public String getTeanInfo(){
        return "Coach: " + coachName + " , Team name: "  + teamName;
    }
       // expose "/" that return "Hello World"

    @GetMapping("/")
    public String sayHello() {
        return "Hello World! Time on server is " + LocalDateTime.now();
    }

    // expose new endpoint for /workout

    @GetMapping("/workout")
    public String getDailyWorkout() {
        return "Run a hard 5k!";
    }

    @GetMapping("/fortune")
    public String getDailyFortune() {
        return "Today is your lucky day.";
    }

}




