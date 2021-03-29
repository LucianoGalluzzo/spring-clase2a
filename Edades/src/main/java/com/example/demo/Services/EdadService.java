package com.example.demo.Services;

import com.example.demo.DTO.EdadDTO;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.Date;


public class EdadService {

    public static int obtenerEdad(EdadDTO edad){
        LocalDate date = LocalDate.of(edad.getYear(), edad.getMonth(), edad.getDay());
        Period period = Period.between(date, LocalDate.now());
        return period.getYears();

    }
}
