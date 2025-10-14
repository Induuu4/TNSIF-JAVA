package com.example.teegalagroupproject.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.teegalagroupproject.model.Item;

//Marker Interface
public interface ItemRepo extends JpaRepository<Item, Long> {



}
