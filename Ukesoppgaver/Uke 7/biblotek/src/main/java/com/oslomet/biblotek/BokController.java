package com.oslomet.biblotek;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BokController {
    public List<Bok> bokList = new ArrayList<>();

    @GetMapping("/getBok")
    public Bok GetBok(){
        return new Bok("Hodejegere", "Krim", "Jo Nesbø", 455, "00IWB388388");
    }
    @PostMapping("/setBok")
    public String setBok(@RequestBody Bok bok){
        bokList.add(bok);
        return "Ny bok er registrer!";
    }

    @GetMapping("/getBoker")
    public List<Bok> getBoker(){
        return bokList;
    }
}
