package com.app.javapj.controllers;


import com.app.javapj.model.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/test")
public class TestController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping("/TestController")
    public List<Test> listAllContact(){
        String sql = "SELECT * FROM TEST";
        List<Test> tests = jdbcTemplate.query(sql,
                BeanPropertyRowMapper.newInstance(Test.class));
        return  tests;
    }
}
