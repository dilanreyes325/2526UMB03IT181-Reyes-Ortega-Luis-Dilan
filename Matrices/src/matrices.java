//ALUMNO: Luis Dilan Reyes Ortega 
//PROFESOR: Ronny Gonzalez 
//CARRERA: Ing. Tics
//GRUPO:03IT181
//MATERIA: Estructura de datos

public class matrices {
    public static void main(String[] args) {

        int m[][] = new int[10][5];
        int i;
        int j;
        int num = 1;

        // Aqui vamos a llenar la matriz 
        for (i = 0; i < 10; i++) {
            for (j = 0; j < 5; j++) {
                m[i][j] = num;
                num++;
            }
        }
        // Aqui se va a mostrar la matriz
        System.out.println("Matriz 10x5:");

        for (i = 0; i < 10; i++) {
            for (j = 0; j < 5; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }
}