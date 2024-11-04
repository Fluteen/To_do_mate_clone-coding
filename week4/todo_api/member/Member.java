package com.example.todo_api.member;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Member {

    @Id
    private Long id;

    private String log_id;
    
    private String log_pwd;
}
