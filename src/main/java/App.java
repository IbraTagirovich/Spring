import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld hello1 = context.getBean("helloworld", HelloWorld.class);
        HelloWorld hello2 = context.getBean("helloworld", HelloWorld.class);

        System.out.println("Hello1 message: " + hello1.getMessage());
        System.out.println("Hello2 message: " + hello2.getMessage());

        System.out.println("Одинаковык бины класса HelloWorld: " + (hello1 == hello2));

        Cat cat1 = context.getBean("cat", Cat.class);
        Cat cat2 = context.getBean("cat", Cat.class);

        System.out.println("Cat1 name: " + cat1.getName());
        System.out.println("Cat2 name: " + cat2.getName());

        System.out.println("Одинаковые бины класса Cat: " + (cat1 == cat2));
    }
}