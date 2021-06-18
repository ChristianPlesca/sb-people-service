package com.example.peopleservice.person.control;

import java.util.ArrayList;
import java.util.List;

import com.example.peopleservice.person.boundary.PersonRepository;
import com.example.peopleservice.person.entity.Person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class PersonService {
    
    @Autowired
    PersonRepository personRepository;

    public List<Person> getPeople() {
        
        Iterable<Person> people = personRepository.findAll();

        List<Person> peopleList = new ArrayList<Person>();
        people.forEach(peopleList::add);

        return peopleList;
    }
}
