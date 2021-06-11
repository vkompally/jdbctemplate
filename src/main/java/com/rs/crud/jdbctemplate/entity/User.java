package com.rs.crud.jdbctemplate.entity;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private  int id;
    private  String fname;
    private  String lname;
    private  String email;


}
