package spring;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{

    private FortuneService fortuneService;
//    @Autowired
//    TennisCoach(FortuneService fortuneService){
//        this.fortuneService=fortuneService;
//    }
    @Autowired
    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
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
