package web.model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarsListClass {

    private List<Car> carsList;

    public CarsListClass() {
        carsList = new ArrayList<>();
        carsList.add(new Car("Nissan", "Teana", 2007));
        carsList.add(new Car("Ford", "Focus", 2006));
        carsList.add(new Car("Cadillac", "Escalade", 2011));
        carsList.add(new Car("Volkswagen", "Passat", 2020));
        carsList.add(new Car("BMW", "X5M", 2020));
    }

    public List<Car> getCarsList() {
        return carsList;
    }
}
