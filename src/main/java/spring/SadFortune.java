package spring;

public class SadFortune implements FortuneService{
    @Override
    public String getFortuneService() {
        return "Sad day for you,today!";
    }
}
