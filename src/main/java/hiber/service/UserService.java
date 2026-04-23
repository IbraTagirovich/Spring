package hiber.service;

import hiber.model.User;
import java.util.List;

public interface UserService {
    void add(User user);
    List<User> listUsers();
    User getUserByCarModelAndSeries(String model, int series); //добавил новый метод для того чтобы hql запросом доставать юзера,
                                                               //который владеет машиной по модели и по серии
}