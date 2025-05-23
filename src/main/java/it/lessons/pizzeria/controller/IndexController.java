package it.lessons.pizzeria.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/")
public class IndexController {
    
    //  lo scopo di questo GetMapping è quello di reindirizzare verso la pagina pizzas
    //  in maniera tale che quando si va su localhost:8080 fa il redirect direttamente su pizzas
    @GetMapping
    public String getMethodName() {
        return "redirect:/pizzas";
    }
    
}
