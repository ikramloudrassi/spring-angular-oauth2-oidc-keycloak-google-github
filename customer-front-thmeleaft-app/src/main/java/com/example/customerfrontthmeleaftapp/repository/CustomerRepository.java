package com.example.customerfrontthmeleaftapp.repository;

import com.example.customerfrontthmeleaftapp.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
}
