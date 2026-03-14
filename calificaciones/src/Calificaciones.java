/*
Nombre: Luis Dilan Reyes Ortega
Grupo:03IT181
Materia: Estructura de Datos
Programa: Calificaciones aprobatorias o reprobatorias
Profesor: Ronny Gonzales
*/
import java.util.Scanner;

public class Calificaciones {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int Par1, Par2, Par3, suma;

        System.out.println("Ingresa la calificacion del primer parcial:");
        Par1 = leer.nextInt();

        System.out.println("Ingresa la calificacion del segundo parcial:");
        Par2 = leer.nextInt();

        System.out.println("Ingresa la calificacion del tercer parcial:");
        Par3 = leer.nextInt();

        suma = Par1 + Par2 + Par3;

        if (suma >= 85) {
            System.out.println("¡Ujuuuuuuuuuuu, aprobaste!");
        } else {
            System.out.println("¡Rayos, reprobaste!");
        }
    }
}