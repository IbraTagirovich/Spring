package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AnimalsCage {

    @Autowired
    @Qualifier("dog")
    private Animal animal;

    @Autowired
    private Timer timer;

    public void whatAnimalSay() {
        System.out.println("Скажет:");
        System.out.println(animal.toString());
        System.out.println("В:");
        System.out.println(timer.getTime());
    }

    public Timer getTimer() {
        return timer;
    }
}