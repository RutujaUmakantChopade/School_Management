package com.SchoolManagement.SchoolManagement.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Subject {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private long sub_id;
    private  String Sub_name;
}
