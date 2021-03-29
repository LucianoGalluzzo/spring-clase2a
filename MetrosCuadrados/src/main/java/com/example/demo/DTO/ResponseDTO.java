package com.example.demo.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseDTO {

    private double metrosCuadrados;
    private double valor;
    private HabitacionDTO habitacionMasGrande;
    private List<Double> metrosCuadradosPorHabitacion;


}
