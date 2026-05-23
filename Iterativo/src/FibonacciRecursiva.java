import java.util.Scanner;

public class FibonacciRecursiva {
    public static void main(String[] args) {
        try (Scanner lectorDatos = new Scanner(System.in)) {
            System.out.print("¿Qué posición de Fibonacci deseas calcular?: ");
            int posicionDeseada = lectorDatos.nextInt();
            // Llamada al método recursivo
            int resultadoFibonacci;
            resultadoFibonacci = obtenerFibonacci(posicionDeseada);
            System.out.println("El número en la posición "
                    + posicionDeseada + " es: " + resultadoFibonacci);
            // Cerramos el Scanner
        }
    }

    // Método recursivo para calcular Fibonacci
    public static int obtenerFibonacci(int indice) {
        // CASO BASE
        if (indice <= 1) {
            return indice;
        }
        
        // CASO RECURSIVO
        return obtenerFibonacci(indice - 1) 
             + obtenerFibonacci(indice - 2);
    }
}