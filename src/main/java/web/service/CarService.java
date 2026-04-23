package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {

    private final List<Car> cars;

    public CarService() {
        cars = new ArrayList<>();
        cars.add(new Car("Toyota", "Camry", 2020));
        cars.add(new Car("Honda", "Civic", 2019));
        cars.add(new Car("BMW", "X5", 2021));
        cars.add(new Car("Audi", "A4", 2022));
        cars.add(new Car("Mercedes", "C-Class", 2023));
        cars.add(new Car("Ford", "Mustang", 2018));
        cars.add(new Car("Chevrolet", "Malibu", 2020));
        cars.add(new Car("Tesla", "Model 3", 2022));
        cars.add(new Car("Nissan", "Altima", 2019));
        cars.add(new Car("Hyundai", "Sonata", 2021));
        cars.add(new Car("Kia", "Sportage", 2023));
        cars.add(new Car("Volkswagen", "Passat", 2017));
        cars.add(new Car("Subaru", "Outback", 2020));
        cars.add(new Car("Lexus", "RX 350", 2022));
        cars.add(new Car("Mazda", "CX-5", 2021));
    }


    public List<Car> getCars(int count) {
        if (count >= cars.size() || count < 1) {
            return new ArrayList<>(cars);
        }
        return new ArrayList<>(cars.subList(0, count));
    }
}