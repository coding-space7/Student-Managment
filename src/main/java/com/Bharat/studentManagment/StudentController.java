package com.Bharat.studentManagment;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class StudentController {

    Map<Integer,Student> db = new HashMap<>();

    @GetMapping("/getStudentByAdmNo")
    public Student getStudent(@RequestParam("q") int admNo){
        return db.get(admNo);
    }
    @PutMapping("/changeStudentByAdmNoAndName")
    public Student changeStudentByAdmNoAndName(@RequestParam("admNo") int admNo,@RequestParam("name") String name){
        Student student = db.get(admNo);
        student.setName(name);
        db.put(admNo,student);
        return db.get(admNo);
    }

    @PostMapping("/addStudent")
    public String addStudent(@RequestBody Student student){
        int admNo = student.getAdminNo();
        db.put(admNo,student);
        return "Student added successfully.";
    }

    @DeleteMapping("/deleteStudent/{admNo}")
    public String deleteStudent(@PathVariable("admNo") int admNo){
        db.remove(admNo);
        return "Student deleted successfully";
    }



}
