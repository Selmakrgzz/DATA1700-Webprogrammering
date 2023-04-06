package com.oslomet.biler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BilerController {
    //Bilene skal lagres i en ArrayList
    public List BilerList = new ArrayList<>();

    //Gir info til klient
    @GetMapping("/getBiler")
    public Biler biler(){
        return new Biler("Tesla", "Svart", 2020);
    }
    //Mottar info fra klient. Legger til nye biler
    //i Postman(body) og sender til server, som legger
    //til de nye bilene i arrayet. Når den nye bilens
    //info er motatt, så får vi en melding om at
    //serverern har motatt
    @PostMapping("/setBiler")
    public String setBiler(@RequestBody Biler biler){
        BilerList.add(biler);
        return "Motatt bilregister";
    }

    //Skriver ut alle bilene, som ligger i arrayet.
    //Det kan hende man får "[]", som betyr
    //at arrayet er tomt. Man må derfor legge til
    //biler i arrayet, fordi de kan slettes når
    //man refresher siden. Dersom vi hadde en
    //database, så ville den ha holdt på dataene
    //selv om vi refresher siden
    @GetMapping("/getAlleBiler")
    public List<Biler> getBiler(){
        return BilerList;
    }


}
