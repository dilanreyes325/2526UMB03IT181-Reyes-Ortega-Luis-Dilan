import java.util.Scanner; // Importamos la clase para leer datos
public class Fibonacciiterativo {
    public static void main(String[] args) {
        try (Scanner lector = new Scanner(System.in) // Antes: teclado
        ) {
            System.out.print("Introduce qué número de Fibonacci quieres: ");
            int posicion = lector.nextInt();  // Antes: numeroIngresado
            // Llamamos a la función con la nueva variable
            int valorFibonacci = calcularFibonacci(posicion);  // Antes: resultado
            System.out.println("El número en la posición " + posicion + " es: " + valorFibonacci);
            // Cerramos el Scanner
        }
    }

    // Función que calcula el número de Fibonacci
    public static int calcularFibonacci(int indice) {  // Antes: fibonacci(int n)
        int primerNumero = 0;   // Antes: a
        int segundoNumero = 1;  // Antes: b
        
        for (int contador = 0; contador < indice; contador++) {  // Antes: i y n
            int suma = primerNumero + segundoNumero;  // Antes: siguiente
            primerNumero = segundoNumero;
            segundoNumero = suma;
        }
        
        return primerNumero;
    }
}