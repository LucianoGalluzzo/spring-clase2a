package com.example.demo.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CasaDTO {

    private String nombre;
    private String direccion;
    private List<HabitacionDTO> habitaciones;




}
