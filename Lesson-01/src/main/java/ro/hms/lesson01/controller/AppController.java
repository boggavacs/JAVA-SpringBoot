package ro.hms.lesson01.controller;

import org.springframework.web.bind.annotation.RestController;

import ro.hms.lesson01.coach.Coach;
import ro.hms.lesson01.services.User1Service;
import ro.hms.lesson01.services.Users1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class AppController {

    private Coach coach;

    @Autowired
    User1Service user1Service;

    @Autowired
    AppController(@Qualifier("cricketCoach") Coach ch) {
        this.coach = ch;
    }

    @GetMapping("/users")
    public Users1 getTotalUsers() {
        return user1Service.getServiceUser1();
    }

    @GetMapping("/coach")
    public String getCoach(){
        return coach.getDailyWorkouts();
    }

}
