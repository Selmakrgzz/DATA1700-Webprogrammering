package com.oslomet.oppgave2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class ValutaController {

    private ArrayList<Valuta> valutaer = new ArrayList<>(){{
        add(new Valuta("USD",));
    }
    };



    @PostMapping("/valuta")
    public double returValuta(Valuta innValuta){
        for(Valuta valuta : valutaer){
            if(innValuta.getNavn().Equal(...)){

            }
        }
    };
}
