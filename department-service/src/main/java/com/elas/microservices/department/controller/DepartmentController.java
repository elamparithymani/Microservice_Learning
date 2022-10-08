package com.elas.microservices.department.controller;

import com.elas.microservices.department.entity.Department;
import com.elas.microservices.department.respository.DepartmentRepository;
import com.elas.microservices.department.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department) {
   //     log.info("Inside SaveDepartment method of Department Controller");
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/{id}")
    public Department findDepartmentById(@PathVariable("id") Long departmentId) {
//        log.info("");
        return  departmentService.findDepartmentById(departmentId);
    }

}
