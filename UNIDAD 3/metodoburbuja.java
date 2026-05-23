//Nombre: Luis Dilan Reyes Ortega
//Grupo:03IT181
//Materia: Estructura de Datos
//Programa: Metodo Burbuja
//Profesor: Ronny Gonzalez 
public class burbuja {

    public static void main(String[] args) {

        // Declaramos el arreglo
        int[] arreglo = {9, 2, 7, 1, 5};

        int i, j, aux;

        System.out.println("Arreglo original:");

        // Mostrar arreglo original
        for(i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }

        // Metodo Burbuja
        for(i = 0; i < arreglo.length; i++) {

            for(j = 0; j < arreglo.length - 1; j++) {

                // Comparar números
                if(arreglo[j] > arreglo[j + 1]) {

                    // Intercambiar valores
                    aux = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = aux;
                }
            }
        }

        System.out.println("\n\nArreglo ordenado:");

        // Mostrar arreglo ordenado
        for(i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
    }
}