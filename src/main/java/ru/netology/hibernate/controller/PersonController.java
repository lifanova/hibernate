package ru.netology.hibernate.controller;

import ru.netology.hibernate.model.Person;
import ru.netology.hibernate.service.PersonService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class PersonController {
    private PersonService personService;
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/persons/by-city")
    public List<Person> getPersonsByCity(String city) {
        List<Person> resultList = personService.getPersonsByCity(city);
        System.out.println("В городе " + city + " живут клиенты:");
        resultList.forEach(System.out::println);

        return resultList;
    }

}
