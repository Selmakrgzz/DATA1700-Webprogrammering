package com.example.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class studentController {
    @GetMapping("/getStudent")
    public Student getStudent(){
        return new Student("Selma", 19);
        }
}
