package com.oslomet.biler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BilerController {
    List<Biler> bilList = new ArrayList<>();

    @PostMapping("/setBil")
    public String setBil(Biler bil){
        bilList.add(bil);
        return "Registrering fullført!";
    }

    @GetMapping("/getBil")
    public List<Biler> getBil(){
       return bilList;
    }

    @GetMapping("/deleteBil")
    public List<Biler> deleteBil(){
        bilList.clear();
        return bilList;
    }
}
