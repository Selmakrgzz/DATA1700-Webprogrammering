package com.oslomet.student;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {
    public List<Student> studentList = new ArrayList<>();

    @GetMapping("/getStudent")
    public Student student(){
        return new Student("Selma", "S374977");
    }

    @PostMapping("/setStudent")
    public String setStudent(Student student){
        studentList.add(student);
        return "Motatt";
    }

    @GetMapping("/getStudenter")
    public List<Student> studentList(){
        return studentList;
    }

    @DeleteMapping("/deleteStudent")
    public String deleteStudent(String studentnr){
        return "Student er slettet!";
    }
}
