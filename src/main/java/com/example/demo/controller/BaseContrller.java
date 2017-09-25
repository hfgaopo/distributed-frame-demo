package com.example.demo.controller;

import com.example.demo.model.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by  gaopo on  2017/9/25.
 */
@RestController
@RequestMapping("/")
public class BaseContrller {
    @Autowired
    private Author author;

    @RequestMapping("/")
    public String toIndex(){
        return "hello spring boot demo\n name:"+author.getName()+" age:"+author.getAge()+" color:"+author.getColor();
    }

}
