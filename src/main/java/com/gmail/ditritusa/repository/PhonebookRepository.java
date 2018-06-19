package com.gmail.ditritusa.repository;

import com.gmail.ditritusa.model.Phonebook;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhonebookRepository extends JpaRepository<Phonebook,Integer> {
}
