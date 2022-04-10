package spring;

import org.springframework.stereotype.Component;

@Component
public class DatabaseFortunr implements FortuneService{
    @Override
    public String getFortuneService() {
        return "Database fortune service";
    }
}
