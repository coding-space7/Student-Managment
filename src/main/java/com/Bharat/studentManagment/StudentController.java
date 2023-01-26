package com.Bharat.studentManagment;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class StudentController {

    Map<Integer,Student> db = new HashMap<>();

    @GetMapping("/getStudent")
    public Student getStudent(@RequestParam("q") int admNo){
        return db.get(admNo);
    }

    @PostMapping("/addStudent")
    public String addStudent(@RequestBody Student student){
        int admNo = student.getAdminNo();
        db.put(admNo,student);
        return "Student added successfully.";
    }
}
