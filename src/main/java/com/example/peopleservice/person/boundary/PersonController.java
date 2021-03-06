package com.example.peopleservice.person.boundary;

import java.util.List;

import javax.validation.Valid;

import com.example.peopleservice.person.control.PersonService;
import com.example.peopleservice.person.entity.Person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

    @GetMapping("{id}")
    public Person getPerson (@PathVariable("id") Long id) {
        
        return personService.getPerson(id);
    }

    @PostMapping
    public Person newPerson (@RequestBody @Valid Person person) {

        return personService.newPerson(person);
    }

    @PutMapping("{id}")
    public Person updatePerson(@PathVariable("id")Long id, @RequestBody @Valid Person person) {

        return personService.updatePerson(id, person);
    }

    @DeleteMapping("{id}")
    public void deletePerson(@PathVariable("id")Long id) {

        personService.deletePerson(id);
    }
}
