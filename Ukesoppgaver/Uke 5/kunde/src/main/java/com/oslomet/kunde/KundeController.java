package com.oslomet.kunde;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KundeController {
    @GetMapping("/kunde")
    public Kunde returKunde(Kunde nyKunde){
        return nyKunde;
    }
}
