package com.example.demo.Services;


import com.example.demo.DTO.CasaDTO;
import com.example.demo.DTO.HabitacionDTO;

import java.util.ArrayList;
import java.util.List;

public class CasaService {

    public static double metrosCuadrados(CasaDTO casa){
        double resultado=0;
        for(int i=0; i<casa.getHabitaciones().size(); i++){
            resultado+=metrosCuadradosPorHabitacion(casa.getHabitaciones().get(i));
        }
        return resultado;
    }

    public static double metrosCuadradosPorHabitacion(HabitacionDTO habitacion){
        return habitacion.getAncho() * habitacion.getLargo();
    }

    public static double valorDeLaCasa(CasaDTO casa){
        return 800 * metrosCuadrados(casa);
    }

    public static HabitacionDTO habitacionMasGrande(CasaDTO casa){
        double mayor=0;
        int posMayor=0;
        for (int i = 0; i < casa.getHabitaciones().size(); i++) {
            if(metrosCuadradosPorHabitacion(casa.getHabitaciones().get(i)) > mayor){
                mayor = metrosCuadradosPorHabitacion(casa.getHabitaciones().get(i));
                posMayor = i;
            }
        }
        return casa.getHabitaciones().get(posMayor);
    }

    public static List<Double> listaDeMetrosCuadradosPorHabitacion (CasaDTO casa){
        List<Double> list = new ArrayList<>();
        for (int i = 0; i < casa.getHabitaciones().size(); i++) {
            list.add(metrosCuadradosPorHabitacion(casa.getHabitaciones().get(i)));

        }
        return list;
    }

}
