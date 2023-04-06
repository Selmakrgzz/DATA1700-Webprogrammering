package com.oslomet.treningssenter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MedlemController {
    public List medlemList = new ArrayList<>();
    @GetMapping("/getMedlem")
    public Medlem medlem(){
        return new Medlem("Selma", 19, "Kvinne", "Basic");
    }

    @PostMapping("/setMedlem")
    public String setMedlem(@RequestBody Medlem medlemmer){
        medlemList.add(medlemmer);
        return "Medlem registrer!";
    }

    @GetMapping("/getAlleMedlemmer")
    public List<Medlem> getMedlemmer(){
        return medlemList;
    }
}
