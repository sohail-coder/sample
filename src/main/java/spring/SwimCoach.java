package spring;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach{
    private FortuneService fortuneService;
    public SwimCoach(FortuneService fortuneService){
        this.fortuneService=fortuneService;
    }
    @Value("${foo.mail}") private String email;
    @Value("${foo.username}") private String username;

    @Override
    public String getDialyWorkout() {
        return "swim for 30 mins";
    }

    @Override
    public String getDailtFortune() {
        return fortuneService.getFortuneService();
    }

    public String getEmail() {
        return email;
    }

    public String getUsername() {
        return username;
    }
}
