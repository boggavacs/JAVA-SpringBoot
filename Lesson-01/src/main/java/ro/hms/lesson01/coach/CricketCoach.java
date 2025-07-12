package ro.hms.lesson01.coach;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

    @Override
    public String getDailyWorkouts() {
       return "THis is Cricket coach.";
    }

}
