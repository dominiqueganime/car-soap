package com.soap.car.service;

import com.soap.car.model.Car;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Service
public class CarService {

    private static final Map<String, Car> cars = new HashMap<>();

    @PostConstruct
    public void inizialize() {
        Car car1 = new Car();
        car1.setBrand("BMW");
        car1.setCarId(1);
        car1.setPrice(80000);

        Car car2 = new Car();
        car2.setBrand("Toyota");
        car2.setCarId(2);
        car2.setPrice(60000);

        Car car3 = new Car();
        car3.setBrand("Fiat");
        car3.setCarId(3);
        car3.setPrice(40000);

        cars.put(car1.getBrand(), car1);
        cars.put(car2.getBrand(), car2);
        cars.put(car3.getBrand(), car3);
    }

    public Car getCars(String name) {
        System.out.println(name);
        return cars.get(name);
    }
}
