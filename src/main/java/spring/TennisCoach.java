package spring;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope("singleton")
public class TennisCoach implements Coach{
    @Autowired
    @Qualifier("happyFortune")
    private FortuneService fortuneService;
//    @Autowired
//    TennisCoach(FortuneService fortuneService){
//        this.fortuneService=fortuneService;
//    }
//    @Autowired
//    public void setFortuneService(FortuneService fortuneService) {
//        this.fortuneService = fortuneService;
//    }

    @Override
    public String getDialyWorkout() {
        return "Run for 2km";
    }

    @Override
    public String getDailtFortune() {
        return fortuneService.getFortuneService();
    }

    //init method
   @PostConstruct
    public void initMethod(){
        System.out.println("in init method");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("in destroy method");
    }









}
