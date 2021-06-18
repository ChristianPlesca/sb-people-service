package com.example.peopleservice.person.boundary;

import java.util.List;

import com.example.peopleservice.person.control.PersonService;
import com.example.peopleservice.person.entity.Person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping(value = "v1/people")
public class PersonController {
    
    @Autowired
    PersonService personService;

    @GetMapping
    public List<Person> getPeople() {

        return personService.getPeople();
    }
}
