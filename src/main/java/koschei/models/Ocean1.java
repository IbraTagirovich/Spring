package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Ocean1 {

    @Autowired          // связывание через поле (field injection)
    private Island2 island;

    @Override
    public String toString() {
        // обратите внимание: убираем лишний пробел после "остров"
        return "на океане остров " + island.toString();
    }
}