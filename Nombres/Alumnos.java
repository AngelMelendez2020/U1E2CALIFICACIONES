package Nombres;

import java.util.Scanner;

public class Alumnos {

    public static String[] alumnos = {"Ariagna Acevedo Campos", "Ambrocio Perez Michael", "Ambrosio Hernandez Vianey", "Campos Casasanero Juan", "Díaz de Jesús Mariana", "Díaz Rosas Alexis", "Dominguez Cazales Jennifer", "Eligio Ramos Monserrat", "Flores Maldonado Liliana", "Gómez Aragon Edgar", "Gutierrez Valle Samara", "Juarez Ramos Alexis", "Leyva Silva Rogelio", "Martinez de los Santos Isabel", "Melendez Mendoza Vicente"};
    public static int[] control = {18680056, 1968091, 1968092, 19680113, 19680133, 19680136, 19680108, 18680108, 19680177, 18890123, 19680293, 18680293, 18680456, 19680333, 18680172};
    public static int cal = 0;
    public static int cal1;
    public static int promedio2 = 0;
    static Scanner entrada = new Scanner(System.in);
    public static int i=0;
    public static int suma1;
    public static int suma2;
    public void lista() {
        
        for ( i = 0; i < 15; i++) {

            System.out.println("Ingrese la calificacion de " + alumnos[i] + " con numero de control " + control[i]);
            cal1 = entrada.nextInt();
            cal = cal1 + cal;
            
            if(i>=0 && i<=4){
            suma1+=cal1;
                
            }
            if(i>=10 && i<=14){
            suma2+=cal1;
        }
        
    }
    }
}
