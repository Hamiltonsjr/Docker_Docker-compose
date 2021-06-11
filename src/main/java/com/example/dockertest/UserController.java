package com.example.dockertest;

import com.example.dockertest.entities.User;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @RequestMapping(value =  "/userFull", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public User getNameUser(){
        User user = new User("Carlos Eduardo jr ","Cadu");
        return user;
    }
}
