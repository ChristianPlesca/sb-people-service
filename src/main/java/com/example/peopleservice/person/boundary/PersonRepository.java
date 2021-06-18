package com.example.peopleservice.person.boundary;

import com.example.peopleservice.person.entity.Person;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends CrudRepository<Person, Long> {
}
