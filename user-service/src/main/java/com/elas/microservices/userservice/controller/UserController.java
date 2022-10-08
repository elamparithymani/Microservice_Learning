package com.elas.microservices.userservice.controller;

import com.elas.microservices.userservice.VO.ResponseTemplateVO;
import com.elas.microservices.userservice.entity.User;
import com.elas.microservices.userservice.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/")
    public User saveUser(@RequestBody User user) {
  //      log.info("Inside saveuser of usercontroller");
        return userService.saveUser(user);
    }

    @GetMapping("/{id}")
    public ResponseTemplateVO getUserWithDepartment(@PathVariable("id")  Long userId) {
  //      log.info("Inside getUserWithDepartment of usercontroller");
        return userService.getUserWithDepartment(userId);
    }
}

