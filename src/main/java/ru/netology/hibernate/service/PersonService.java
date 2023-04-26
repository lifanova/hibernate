package ru.netology.hibernate.service;

import ru.netology.hibernate.model.Person;
import org.springframework.stereotype.Service;
import ru.netology.hibernate.repository.PersonRepository;

import java.util.List;

@Service
public class PersonService {
    private PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public List<Person> getPersonsByCity(String city) {
        return personRepository.getPersonsByCity(city);
    }

}
