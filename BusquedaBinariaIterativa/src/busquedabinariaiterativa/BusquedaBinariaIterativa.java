//REYES ORTEGA LUIS DILAN
//RONNY GONZALES
//03IT181
//ESTRUCTURA DE DATOS
package busquedabinariaiterativa;

public class BusquedaBinariaIterativa {

    public static void main(String[] args) {

        int numeros[] = {2, 4, 6, 8, 10};
        int buscar = 8;

        int inicio = 0;
        int fin = numeros.length - 1;
        int medio;
        boolean encontrado = false;

        while (inicio <= fin) {

            medio = (inicio + fin) / 2;

            if (numeros[medio] == buscar) {
                System.out.println("Numero encontrado en la posicion: " + medio);
                encontrado = true;
                break;
            }

            if (buscar > numeros[medio]) {
                inicio = medio + 1;
            } else {
                fin = medio - 1;
            }
        }

        if (!encontrado) {
            System.out.println("Numero no encontrado");
        }
    }
}