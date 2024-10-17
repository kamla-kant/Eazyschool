package com.example.eazyschool.repository;

import com.example.eazyschool.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Integer> {
    Person readByEmail(String email);
}
