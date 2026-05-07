//REYES ORTEGA LUIS DILAN
//RONNY GONZALES
//03IT181
//ESTRUCTURA DE DATOS
package ochoreinas;

public class OchoReinas {

    static final int N = 8;

    static void imprimirTablero(int tablero[][]) {

        System.out.println("\nSOLUCION DEL PROBLEMA DE LAS 8 REINAS\n");

        for (int i = 0; i < N; i++) {

            for (int j = 0; j < N; j++) {

                if (tablero[i][j] == 1) {
                    System.out.print(" Q ");
                } else {
                    System.out.print(" . ");
                }
            }

            System.out.println();
        }
    }

    static boolean esSeguro(int tablero[][], int fila, int col) {

        for (int i = 0; i < col; i++) {

            if (tablero[fila][i] == 1) {
                return false;
            }
        }

        for (int i = fila, j = col; i >= 0 && j >= 0; i--, j--) {

            if (tablero[i][j] == 1) {
                return false;
            }
        }

        for (int i = fila, j = col; i < N && j >= 0; i++, j--) {

            if (tablero[i][j] == 1) {
                return false;
            }
        }

        return true;
    }

    static boolean resolverReinas(int tablero[][], int col) {

        if (col >= N) {
            return true;
        }

        for (int i = 0; i < N; i++) {

            if (esSeguro(tablero, i, col)) {

                tablero[i][col] = 1;

                if (resolverReinas(tablero, col + 1)) {
                    return true;
                }

                tablero[i][col] = 0;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        int tablero[][] = new int[N][N];

        if (resolverReinas(tablero, 0)) {

            imprimirTablero(tablero);

        } else {

            System.out.println("No existe solucion");
        }
    }
}