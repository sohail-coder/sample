package spring;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{
    @Autowired
    private FortuneService fortuneService;
    TennisCoach(FortuneService fortuneService){
        this.fortuneService=fortuneService;
    }
    @Override
    public String getDialyWorkout() {
        return "Run for 2km";
    }

    @Override
    public String getDailtFortune() {
        return fortuneService.getFortuneService();
    }
}
