package com.oslomet.valuta;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ValutaController {
    public List<Valuta> valutaList = new ArrayList<>();

    @GetMapping("/getValuta")
    public Valuta enValuta(){
        return new Valuta("NOK", 10.2);
    }

    @PostMapping("/setValuta")
    public String setValuta(@RequestBody Valuta valuta){
        valutaList.add(valuta);
        return "Nytt valuta registrert!";
    }

    @GetMapping("/getAlleValuta")
    public List<Valuta> getAlleValuta(){
        return valutaList;
    }
}
