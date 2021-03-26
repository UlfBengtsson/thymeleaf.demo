package se.lexicon.ulf.thymeleaf.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import se.lexicon.ulf.thymeleaf.demo.dao.CarRepository;

@Controller
@RequestMapping("/Cars")
public class CarsController {

    @Autowired
    private CarRepository carRepository;


    @GetMapping("/List")
    public ModelAndView carList(ModelAndView model)
    {
        System.out.println("car list");
        model.setViewName("cars/carList");

        model.addObject("allCars", carRepository.findAll());

        return model;
    }

}
