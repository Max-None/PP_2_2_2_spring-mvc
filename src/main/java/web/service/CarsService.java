package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.model.Car;
import web.model.CarsListClass;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarsService {

    private CarsListClass carsListClass;

    public CarsService (@Autowired CarsListClass carsListClass) {
        this.carsListClass = carsListClass;
    }



    public List<Car> getCars(int numberOfCars) {
        List<Car> list = new ArrayList<>();
        List<Car> sourceList = carsListClass.getCarsList();
        for(int i = 0; i < numberOfCars; i++) {
            list.add(sourceList.get(i));
        }
        return list;
    }
}
