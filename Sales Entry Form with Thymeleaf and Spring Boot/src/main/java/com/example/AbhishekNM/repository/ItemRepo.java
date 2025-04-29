package com.example.AbhishekNM.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.AbhishekNM.entity.Item;

@Repository
public interface ItemRepo extends JpaRepository<Item, Integer> {

}
