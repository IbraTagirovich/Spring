package hiber;

import hiber.config.AppConfig;
import hiber.model.Car;
import hiber.model.User;
import hiber.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class MainApp {
   public static void main(String[] args) {
      AnnotationConfigApplicationContext context =
              new AnnotationConfigApplicationContext(AppConfig.class);

      UserService userService = context.getBean(UserService.class);

      Car car1 = new Car("Nissan", 2025);
      Car car2 = new Car("Subaru", 2024);
      Car car3 = new Car("VAZ", 2004);
      Car car4 = new Car("UAZ", 1996);

      userService.add(new User("Ибрагим", "Курбанов", "ibra@mail.ru", car1));
      userService.add(new User("Николай", "Назаров", "nuhorosho@mail.ru", car2));
      userService.add(new User("Мария", "Голоско", "user3@mail.ru", car3));
      userService.add(new User("Иван", "Мотовилов", "lublu1S@mail.ru", car4));

      List<User> users = userService.listUsers();
      for (User user : users) {
         System.out.println("Id = " + user.getId());
         System.out.println("First Name = " + user.getFirstName());
         System.out.println("Last Name = " + user.getLastName());
         System.out.println("Email = " + user.getEmail());
         if (user.getCar() != null) {
            System.out.println("Car = " + user.getCar());
         }
         System.out.println();
      }

      System.out.println("Поиск владельца машины UAZ");
      User foundUser = userService.getUserByCarModelAndSeries("UAZ", 1996);
      System.out.println("Найден: " + foundUser.getFirstName() + " " + foundUser.getLastName());
      System.out.println("Его/её прекрасная машина: " + foundUser.getCar());

      context.close();
   }
}