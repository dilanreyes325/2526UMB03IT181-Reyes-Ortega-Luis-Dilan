import java.util.Scanner;

public class Calculadora1 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int num1, num2, opcion;

        System.out.println("CALCULADORA");

        System.out.print("Ingresa el primer numero: ");
        num1 = teclado.nextInt();

        System.out.print("Ingresa el segundo numero: ");
        num2 = teclado.nextInt();

        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Division");

        System.out.print("Elige una opcion: ");
        opcion = teclado.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Resultado: " + (num1 + num2));
                break;
            case 2:
                System.out.println("Resultado: " + (num1 - num2));
                break;
            case 3:
                System.out.println("Resultado: " + (num1 * num2));
                break;
            case 4:
                System.out.println("Resultado: " + (num1 / num2));
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }

    }
}
