package com.example.todo_api.hw;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Getter
@Component
@RequiredArgsConstructor
public class MyController {

    private final MyService myservice;

    public void controllerMethod(){
        System.out.println("controller");
        myservice.serviceMethod();
    }
}