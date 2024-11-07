package CompraVenta;


public class Estrellas {
    int filas = 8;
    int columnas = 5;
    String[][] tabla = new String[filas][columnas];


     void tablaFull() {

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 5; j++) {

                if (i == 0 || i == 7) {
                    tabla[i][j] = "*";
                } else if (j == 0 || j == 4) {
                    tabla[i][j] = "*";
                } else {
                    tabla[i][j] = " ";
                }

            }
        }
    }

    void tablaHash() {

        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[1].length; j++) {

                if (i == 0 || i == 7) {
                    if (j % 2 != 0) {
                        tabla[i][j] = "*";
                    } else {
                        tabla[i][j] = " ";
                    }

                } else if (j == 0 || j == 4) {
                    if (i % 2 != 0) {
                        tabla[i][j] = "*";
                    } else {
                        tabla[i][j] = " ";
                    }
                } else {
                        tabla[i][j] = " ";
                }
            }
        }
    }

    void tablaHash2() {

        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[1].length; j++) {

                if (i == 0 || i == 7) {
                    if (j % 2 == 0) {
                        tabla[i][j] = "*";
                    } else {
                        tabla[i][j] = " ";
                    }

                } else if (j == 0 || j == 4) {
                    if (i % 2 == 0) {
                        tabla[i][j] = "*";
                    } else {
                        tabla[i][j] = " ";
                    }
                } else {
                    tabla[i][j] = " ";
                }
            }
        }
    }

    void printTabla() {

        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[1].length; j++) {
                System.out.print(tabla[i][j] + " ");
            }
            System.out.println();
        }
    }

}







