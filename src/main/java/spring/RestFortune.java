package spring;

import org.springframework.stereotype.Component;

@Component
public class RestFortune implements FortuneService{
    @Override
    public String getFortuneService() {
        return "REST fortune service";
    }
}
