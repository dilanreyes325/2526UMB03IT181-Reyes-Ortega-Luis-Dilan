//Nombre: Luis Dilan Reyes Ortega
//Grupo:03IT181
//Materia: Estructura de Datos
//Programa: Pila 
//Profesor: Ronny Gonzalez

public class Pila {

    int[] pila;
    int tope;

    public Pila(int tamaño) {
        pila = new int[tamaño];
        tope = -1;
    }

    public void push(int dato) {
        if (tope == pila.length - 1) {
            System.out.println("La pila está llena");
        } else {
            tope = tope + 1;
            pila[tope] = dato;
            System.out.println("Se agregó: " + dato);
        }
    }

    public int pop() {
        if (tope == -1) {
            System.out.println("La pila está vacía");
            return -1;
        } else {
            int eliminado = pila[tope];
            tope = tope - 1;
            return eliminado;
        }
    }

    public int peek() {
        if (tope == -1) {
            System.out.println("La pila está vacía");
            return -1;
        } else {
            return pila[tope];
        }
    }
}