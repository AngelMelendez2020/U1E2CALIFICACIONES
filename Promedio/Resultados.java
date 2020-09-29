package Promedio;

import Nombres.Alumnos;
import static Nombres.Alumnos.cal;
import static Nombres.Alumnos.suma1;
import static Nombres.Alumnos.suma2;


public class Resultados {

    int promedio = 0;
    
    public void Promedio_Clase() {

        promedio = (cal / Alumnos.alumnos.length);

        System.out.println("El promedio de la clase es: " + promedio);
        System.out.println("");
    }

    public void Promedio_cinco() {

      promedio = (suma1/5);
        System.out.println("El promedio de los primeros 5 es: " +promedio);
        System.out.println("");
    }
    public void Promedio_Ultimoscinco() {

      promedio = (suma2/5);
        System.out.println("El promedio de los ultimos 5 es: " +promedio);
        System.out.println("");
    }
    
    
}
