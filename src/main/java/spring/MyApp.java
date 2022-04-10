package spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
    public static void main(String[] args) {
        final ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Coach coach = context.getBean("tennisCoach",Coach.class);
        System.out.println(coach.getDialyWorkout());
        System.out.println(coach.getDailtFortune());
//        Runtime.getRuntime().addShutdownHook(new Thread() {
//            public void run() {
//                context.close();
//            }});
        context.close();

    }

}
