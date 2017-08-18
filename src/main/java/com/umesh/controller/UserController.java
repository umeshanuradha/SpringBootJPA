package com.umesh.controller;

import com.umesh.entity.User;
import com.umesh.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by umesh_w on 8/16/2017.
 */

@RestController
@RequestMapping(value = "/api")
public class UserController {

    @Autowired
    UserRepository userRepository;


    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<User> findAll(){
        Iterable<User> usersIte = userRepository.findAll();
        List<User> userList = new ArrayList<>();

        for(User u : usersIte ){
            userList.add(u);
        }

        return userList;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String test(){
        return "Hello world";
    }
}
