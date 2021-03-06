package com.example.peopleservice.person.control;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.example.peopleservice.person.boundary.PersonRepository;
import com.example.peopleservice.person.boundary.exceptions.ObjectNotFoundException;
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

    public Person getPerson(Long id) {

        Optional<Person> person = personRepository.findById(id);
        if (person.isPresent()) {
            return person.get();
        }

        throw new ObjectNotFoundException(Person.class, id);
    }

    public Person newPerson(Person person) {

        return personRepository.save(person);

    }

    public Person updatePerson(Long id, Person person) {

        getPerson(id);

        return personRepository.save(person);
    }

    public void deletePerson(Long id) {

        personRepository.delete(getPerson(id));

    }
}
