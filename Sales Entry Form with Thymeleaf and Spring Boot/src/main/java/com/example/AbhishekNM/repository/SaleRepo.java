package com.example.AbhishekNM.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.AbhishekNM.entity.Sale;

@Repository
public interface SaleRepo extends JpaRepository<Sale, Integer> {

}
