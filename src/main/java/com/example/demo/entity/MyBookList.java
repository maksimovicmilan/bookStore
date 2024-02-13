package com.example.demo.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.client.RestTemplate;

@Entity
@Table(name="MyBooks")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class MyBookList {


}

