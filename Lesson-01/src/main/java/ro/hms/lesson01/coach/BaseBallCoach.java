package ro.hms.lesson01.coach;

import org.springframework.stereotype.Component;

@Component
public class BaseBallCoach implements Coach {

    @Override
    public String getDailyWorkouts() {
       return "This is baseball coach";
    }

}
