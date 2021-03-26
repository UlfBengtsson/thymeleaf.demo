package se.lexicon.ulf.thymeleaf.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping(value = {"/","/Index","/Home","/Home/","/Home/Index","/Home/Index/"})
    public ModelAndView index(ModelAndView model)
    {
        model.setViewName("/home/index");
        return model;
    }
}
