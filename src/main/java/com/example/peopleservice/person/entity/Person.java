package com.example.peopleservice.person.entity;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Person {

    @Id
    private Long id;
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private String countryCode;
}
