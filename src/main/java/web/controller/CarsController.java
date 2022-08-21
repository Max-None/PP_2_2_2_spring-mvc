package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarsService;
import java.util.List;

@Controller

public class CarsController {

    @Autowired
    private CarsService carsService;

    @GetMapping(value = "/cars")
    public String carsList(@RequestParam(value = "count", required = false) Integer count, ModelMap model) {
        if ((count == null) || (count >= 5)) count = 5;
        List<Car> cars = carsService.getCars(count);
        model.addAttribute("cars", cars);
        return "cars";
    }

}