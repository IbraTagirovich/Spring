package koschei;

import koschei.models.Ocean1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class KoscheiTheDeathless {

    private Ocean1 ocean;

    // Метод, который возвращает полную фразу
    public String getRulesByDeth() {
        return "На свете есть океан , " + ocean.toString();
    }

    @Autowired          // связывание через сеттер (setter injection)
    public void setOcean(Ocean1 ocean) {
        this.ocean = ocean;
    }
}