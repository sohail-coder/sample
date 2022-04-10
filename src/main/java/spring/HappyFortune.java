package spring;

import org.springframework.stereotype.Component;

@Component
public class HappyFortune implements FortuneService{
    @Override
    public String getFortuneService() {
        return "lucky day";
    }
}
