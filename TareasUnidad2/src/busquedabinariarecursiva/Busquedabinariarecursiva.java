//REYES ORTEGA LUIS DILAN
//RONNY GONZALES
//03IT181
//ESTRUCTURA DE DATOS
package busquedabinariarecursiva;

public class BusquedaBinariaRecursiva {

    public static int busquedaBinaria(int numeros[], int inicio, int fin, int buscar) {

        if (inicio > fin) {
            return -1;
        }

        int medio = (inicio + fin) / 2;

        if (numeros[medio] == buscar) {
            return medio;
        }

        if (buscar > numeros[medio]) {
            return busquedaBinaria(numeros, medio + 1, fin, buscar);
        } else {
            return busquedaBinaria(numeros, inicio, medio - 1, buscar);
        }
    }

    public static void main(String[] args) {

        int numeros[] = {1, 3, 5, 7, 9};
        int buscar = 7;

        int resultado = busquedaBinaria(numeros, 0, numeros.length - 1, buscar);

        if (resultado != -1) {
            System.out.println("Numero encontrado en la posicion: " + resultado);
        } else {
            System.out.println("Numero no encontrado");
        }
    }
}