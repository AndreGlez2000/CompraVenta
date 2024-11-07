package CompraVenta;


public class CompraVenta {
    int alto = 20;
    int largo = 15;
    String[][] tabla = new String[alto][largo];


    void limpiar() { //quitar esta pendejadota en un futuro, solo jala con bash
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }

     void tablaFull() {

        for (int i = 0; i < alto; i++) {
            for (int j = 0; j < largo; j++) {

                if (i == 0 || i == (alto - 1)) {
                    tabla[i][j] = "*";
                } else if (j == 0 || j == (largo - 1)) {
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

                if (i == 0 || i == (alto - 1)) {
                    if (j % 2 != 0) {
                        tabla[i][j] = "*";
                    } else {
                        tabla[i][j] = " ";
                    }

                } else if (j == 0 || j == (largo - 1)) {
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

                if (i == 0 || i == (alto - 1)) {
                    if (j % 2 == 0) {
                        tabla[i][j] = "*";
                    } else {
                        tabla[i][j] = " ";
                    }

                } else if (j == 0 || j == (largo - 1)) {
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

    public static void main(String[] args) throws InterruptedException {
        CompraVenta tabla = new CompraVenta();
        tabla.tablaFull();
        CompraVenta tabla1 = new CompraVenta();
        tabla1.tablaHash();
        CompraVenta tabla2 = new CompraVenta();
        tabla2.tablaHash2();

        int sleep = 130;

        int start = 5;
        int contador = 15;

        while (start != 0) {
            while (contador != 0) {
                tabla.limpiar();
                tabla.printTabla();
                Thread.sleep(sleep);
                tabla.limpiar();
                tabla2.printTabla();
                Thread.sleep(sleep);
                tabla.limpiar();
                tabla1.printTabla();
                Thread.sleep(sleep);
                tabla.limpiar();
                tabla.printTabla();
                Thread.sleep(sleep);
                contador--;
            }
            for (int i = 0; i < 3; i++) {
                tabla.limpiar();
                Thread.sleep(sleep);
                tabla.printTabla();
                Thread.sleep(sleep);
            }

            contador = 15;
            while (contador != 0) {
                tabla.limpiar();
                tabla1.printTabla();
                Thread.sleep(sleep);
                tabla.limpiar();
                tabla2.printTabla();
                Thread.sleep(sleep);
                tabla.limpiar();
                tabla.printTabla();
                Thread.sleep(sleep);
                contador--;
            }
            start--;
        }

    }

}







