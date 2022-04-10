package spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("spring")
@PropertySource("classpath:sport.properties")
public class SpringConfig {
@Bean
    public FortuneService sadFortuneService(){
    return new SadFortune();
}
@Bean
    public Coach swimCoach(){
    return new SwimCoach(sadFortuneService());
}

}
