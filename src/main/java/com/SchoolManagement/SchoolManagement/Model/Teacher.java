package com.SchoolManagement.SchoolManagement.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.Date;

@Data
@Entity
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long t_id;
    private String t_name;
    private String t_email;
    private String gender;
    private  String t_address;
    private Date join_date;
    private String status;
    private long sub_id;

}
