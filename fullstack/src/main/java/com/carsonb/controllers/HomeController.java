package com.carsonb.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.carsonb.models.Person;

import org.springframework.ui.Model;

// Class treated by springboot as a place that is controlling other pages
@Controller
public class HomeController {

    // return a string from /test url
    // @GetMapping --> Look for anything with /test1 in browser bar
    // If so, trigger event (@ResponseBody)
    @GetMapping("/test1")
    @ResponseBody
    public String printHello(){
        return "Hello There!";
    }
    
    @GetMapping("/thyme")
    public String ShowHelloPage(Model model){
        model.addAttribute("message", "Have a great day :)");
        model.addAttribute("date", "2025-02-09");
        return "helloPage";
    }

    @GetMapping("/people")
    public String showPeople(Model model){
        List<Person> people = new ArrayList<Person>();
        people.add(new Person(0, "Scott", 24));
        people.add(new Person(1, "Jason", 33));
        people.add(new Person(2, "Paul", 12));
        people.add(new Person(3, "Trevor", 42));

        System.out.println(people);

        model.addAttribute("people", people);
        return "printPeople";
    }

    @GetMapping("/peopleJSON")
    @ResponseBody
    public List<Person> showPeopleJSON(Model model){
        List<Person> people = new ArrayList<Person>();
        people.add(new Person(0, "Scott", 24));
        people.add(new Person(1, "Jason", 33));
        people.add(new Person(2, "Paul", 12));
        people.add(new Person(3, "Trevor", 42));

        System.out.println(people);

        model.addAttribute("people", people);
        return people;
    }

}
