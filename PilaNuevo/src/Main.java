//Nombre: Luis Dilan Reyes Ortega
//Grupo:03IT181
//Materia: Estructura de Datos
//Programa: Pila 
//Profesor: Ronny Gonzalez

public class Main {

    public static void main(String[] args) {

        PilaNuevo p = new PilaNuevo(3);

        p.push(10);
        p.push(20);
        p.push(30);

        System.out.println("Cima: " + p.peek());
        System.out.println("Eliminado: " + p.pop());
        System.out.println("Nueva cima: " + p.peek());
    }
}