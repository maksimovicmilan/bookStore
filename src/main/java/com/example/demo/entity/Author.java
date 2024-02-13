package com.example.demo.entity;

import jakarta.persistence.Access;
import jakarta.persistence.Entity;
import jdk.jfr.Enabled;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Author {
    private String firstName;
    private String secondName;
    private String DOB; //think about it
    private int awards;
}
