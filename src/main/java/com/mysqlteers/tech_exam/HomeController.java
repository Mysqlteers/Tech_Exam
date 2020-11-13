package com.mysqlteers.tech_exam;

import com.mysqlteers.tech_exam.Model.Person;
import com.mysqlteers.tech_exam.repository.PersonRepository;
import com.mysqlteers.tech_exam.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController {
    private PersonService personService;

    public HomeController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/")//
    public String index(Model model) {
        model.addAttribute("persons", personService.findAll());
        System.out.println("person has entered the page");
        return "index";
    }

    @PostMapping("/createPerson")
    public String createPerson(@ModelAttribute Person newPerson) {
        personService.save(newPerson);
        return "redirect:/";
    }
}
