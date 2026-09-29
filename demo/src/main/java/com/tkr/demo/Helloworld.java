package com.tkr.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller 
public class Helloworld {

    @GetMapping("/hello")
    public String nithin(Model model ) {
        return "index";
    }


    @GetMapping("/name")
    public String Name(Model model) {

        String name1 = "Navya";
        String name2 = "Vaishnavi";

        model.addAttribute("user1", name1);
        model.addAttribute("user2", name2);

        return "names";
    }


    @GetMapping("/add")
    public String calculator() {
        return "add";
    }

    @PostMapping("/add")
    public String add(@RequestParam("num1") int a,
     @RequestParam("num2") int b,
      Model model) {
        int addition = a + b;
        model.addAttribute("result", addition);
        return "add";
    }
    
    



}
