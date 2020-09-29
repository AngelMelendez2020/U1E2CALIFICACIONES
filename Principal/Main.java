package Principal;

import Nombres.Alumnos;
import Promedio.Resultados;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Alumnos obj = new Alumnos();
        Resultados ins = new Resultados();
        obj.lista();
        Scanner leer = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("");

            System.out.println("1.- Para saber el promedio de la clase");
            System.out.println("2.- Para saber solo el promedio de los primeros 5 alumnos");
            System.out.println("3.- Para saber solo el promedio de los últimos 5 alumnos ");
            System.out.println("Salir, presione 4");

            System.out.println("");

            System.out.println("Elige una opcion: ");
            opcion = leer.nextInt();

            System.out.println("");

            switch (opcion) {
                case 1:
                    ins.Promedio_Clase();
                    break;

                case 2:
                    ins.Promedio_cinco();
                    break;

                case 3:
                    ins.Promedio_Ultimoscinco();
                    break;

            }

        } while (opcion != 4);

    }

}
