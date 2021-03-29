package com.example.demo.Controllers;

import com.example.demo.DTO.CasaDTO;
import com.example.demo.DTO.ResponseDTO;
import com.example.demo.Services.CasaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CasaController {

    @PostMapping("/casa")
    public ResponseEntity metrosCuadrados(@RequestBody CasaDTO casa){
        ResponseDTO response = new ResponseDTO();
        response.setMetrosCuadrados(CasaService.metrosCuadrados(casa));
        response.setValor(CasaService.valorDeLaCasa(casa));
        response.setHabitacionMasGrande(CasaService.habitacionMasGrande(casa));
        response.setMetrosCuadradosPorHabitacion(CasaService.listaDeMetrosCuadradosPorHabitacion(casa));

        return new ResponseEntity(response, HttpStatus.OK);

    }




}
