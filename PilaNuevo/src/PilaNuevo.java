//Nombre: Luis Dilan Reyes Ortega
//Grupo:03IT181
//Materia: Estructura de Datos
//Programa: Pila 
//Profesor: Ronny Gonzalez

// Clase PilaNuevo (estructura de datos)
public class PilaNuevo {

    int[] pila;   // arreglo donde guardamos los datos
    int tope;     // indica la posición de la cima

    // Constructor
    public PilaNuevo(int tamaño) {
        pila = new int[tamaño]; // creamos el arreglo
        tope = -1; // inicia vacía
    }

    // PUSH: insertar dato
    public void push(int dato) {

        // Verificamos si está llena
        if (tope == pila.length - 1) {
            System.out.println("La pila está llena");
        } else {
            tope = tope + 1; // subimos el tope
            pila[tope] = dato; // guardamos el dato
            System.out.println("Se agregó: " + dato);
        }
    }

    // POP: eliminar dato
    public int pop() {

        // Verificamos si está vacía
        if (tope == -1) {
            System.out.println("La pila está vacía");
            return -1;
        } else {
            int eliminado = pila[tope]; // guardamos el valor
            tope = tope - 1; // bajamos el tope
            return eliminado; // regresamos el dato eliminado
        }
    }

    // PEEK: ver el último dato
    public int peek() {

        // Verificamos si está vacía
        if (tope == -1) {
            System.out.println("La pila está vacía");
            return -1;
        } else {
            return pila[tope]; // regresamos la cima
        }
    }
}