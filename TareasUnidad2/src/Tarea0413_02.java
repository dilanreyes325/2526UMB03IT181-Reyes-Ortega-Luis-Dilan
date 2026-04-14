// Archivo: Tarea0413_02.java
//Luis Dilan Reyes Ortega
//Ronny Gonzalez
import java.util.Scanner;

public class Tarea0413_02 {

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num;

        System.out.print("Ingresa un numero: ");
        num = teclado.nextInt();

        System.out.println("El factorial es: " + factorial(num));
    }
}
