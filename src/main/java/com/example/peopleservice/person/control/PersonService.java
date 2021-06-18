package com.example.peopleservice.person.control;

import com.example.peopleservice.person.boundary.PersonRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class PersonService {
    
    @Autowired
    PersonRepository personRepository;
}
