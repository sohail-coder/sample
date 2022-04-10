package spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Coach coach = context.getBean("tennisCoach",Coach.class);
        System.out.println(coach.getDialyWorkout());
        System.out.println(coach.getDailtFortune());

    }

}
