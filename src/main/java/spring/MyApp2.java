package spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class MyApp2 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        SwimCoach coach = context.getBean("swimCoach",SwimCoach.class);
        System.out.println(coach.getDialyWorkout());
        System.out.println(coach.getDailtFortune());
//        Runtime.getRuntime().addShutdownHook(new Thread() {
//            public void run() {
//                context.close();
//            }});
        System.out.println(coach.getEmail());
        System.out.println(coach.getUsername());
        context.close();

    }
}
