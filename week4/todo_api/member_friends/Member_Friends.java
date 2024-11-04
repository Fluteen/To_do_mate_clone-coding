package com.example.todo_api.member_friends;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Member_Friends {

    @Id
    private Long id;

    private String f_log_id;

    private String f_log_pwd;


}

