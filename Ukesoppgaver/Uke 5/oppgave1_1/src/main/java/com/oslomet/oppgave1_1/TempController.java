package com.oslomet.oppgave1_1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TempController {
    private final Integer[] tempArray = new Integer[]{-3,-2,2,7,12,16,18,17,12,7,3,-2};
    @GetMapping("/temp")
    public int temp(String maaned){
      int maanednr = switch (maaned){
          case "januar" -> 1;
          case "februar" -> 2;
          case "mars" -> 3;
          case "april" -> 4;
          case "mai" -> 5;
          case "juni" -> 6;
          case "juli" -> 7;
          case "august" -> 8;
          case "september" -> 9;
          case "oktober" -> 10;
          case "november" -> 11;
          case "desember" -> 12;
          default -> -1;
      };
      int temp = tempArray[maanednr-1];
      return temp;
    };
}
