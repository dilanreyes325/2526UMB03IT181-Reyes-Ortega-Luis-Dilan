// Archivo: Tarea0413_01.java
//Luis Dilan Reyes Ortega
//Ronny Gonzalez
import java.util.Scanner;

public class Tarea0413_01 {

    public static int factorial(int n) {
        int resultado = 1;

        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }

        return resultado;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num;

        System.out.print("Coloca un numero: ");
        num = teclado.nextInt();

        System.out.println("El factorial es el siguiente: " + factorial(num));
    }
}
