package com.example.Rupesh.repository;
import com.example.Rupesh.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}

