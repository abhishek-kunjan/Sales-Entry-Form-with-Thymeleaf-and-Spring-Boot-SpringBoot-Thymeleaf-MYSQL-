package com.example.AbhishekNM.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.AbhishekNM.entity.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Integer> {

}
