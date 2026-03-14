import java.util.Scanner;

public class CompararNumeros {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int numero1;
        int numero2;

        System.out.println("Programa para comparar dos numeros");

        System.out.print("Ingresa el primer numero: ");
        numero1 = teclado.nextInt();

        System.out.print("Ingresa el segundo numero: ");
        numero2 = teclado.nextInt();

        if (numero1 > numero2) {
            System.out.println("El primer numero es mayor que el segundo");
        } else if (numero2 > numero1) {
            System.out.println("El segundo numero es mayor que el primero");
        } else {
            System.out.println("Los dos numeros son iguales");
        }

    }
}