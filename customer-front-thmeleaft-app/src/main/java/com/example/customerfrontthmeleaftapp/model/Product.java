package com.example.customerfrontthmeleaftapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class Product {
    private String id;
    private String name;
    private double price;
    private int quantity;
}
