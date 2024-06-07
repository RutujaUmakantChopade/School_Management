package com.SchoolManagement.SchoolManagement.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.Date;

@Data
@Entity
public class Staff {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long staff_id;
    private  String staff_name;
    private String staff_email;
    private  String gender;
    private  String staff_address;
    private Date join_date;
    private String Status;
    private String role;


}
