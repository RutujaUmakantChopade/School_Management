package com.SchoolManagement.SchoolManagement.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long s_id;
    private  String firstName;
    private  String midddleName;
    private  String lastName;
    private long roll_no;
    private  String mob_no;
    private String gender;
    private long age;
    private String permanent_add;
    private long admission_no;
    private String status;
    private long c_id;
}
