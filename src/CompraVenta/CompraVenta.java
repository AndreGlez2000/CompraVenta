package CompraVenta;


import java.io.IOException;

public class CompraVenta {
    int alto = 20;
    int largo = 15;
    int sleep = 150;
    int veces = 5;
    int duracion = 5;
    String[][] tabla = new String[alto][largo];



    public void clearScreen() {
        try {
            if (System.getProperty("os.name").contains("Windows"))
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            else
                Runtime.getRuntime().exec("clear");
        } catch (IOException | InterruptedException ex) {}
    }

//    void clearScreen() { //quitar esta pendejadota en un futuro, solo jala con bash
//        for (int i = 0; i < 50; i++) {
//            System.out.println();
//        }
//    }

     void tablaFull() {

        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[1].length; j++) {

                if (i == 0 || i == (alto - 1)) {
                    tabla[i][j] = "*";
                } else if (j == 0 || j == (largo - 1)) {
                    tabla[i][j] = "*";
                } else {
                    tabla[i][j] = " ";
                }
                System.out.print(tabla[i][j] + " ");

            }
            System.out.println();
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
                System.out.print(tabla[i][j] + " ");

            }
            System.out.println();
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
                System.out.print(tabla[i][j] + " ");
            }
            System.out.println();
        }
    }


//    void print1(int veces, int sleep) throws InterruptedException {
//
//        while (veces != 0) {
//            this.tablaHash();
//            Thread.sleep(sleep);
//            clearScreen();
//            this.tablaHash2();
//            Thread.sleep(sleep);
//            clearScreen();
//            veces--;
//        }
//    }
//
//    void print2(int veces, int sleep) throws InterruptedException {
//
//        while (veces != 0) {
//            this.tablaHash2();
//            Thread.sleep(sleep);
//            clearScreen();
//            this.tablaHash();
//            Thread.sleep(sleep);
//            clearScreen();
//            veces--;
//        }
//    }
//
//    void printIntermedio() throws InterruptedException {
//
//        for (int i = 0; i < 3; i++) {
//            clearScreen();
//            Thread.sleep(450);
//            this.tablaFull();
//            Thread.sleep(450);
//        }
//    }
//
//    void start() throws InterruptedException {
//
//        while (duracion != 0 ) {
//            print1(veces, sleep);
//            printIntermedio();
//            print2(veces, duracion);
//            duracion--;
//        }
}












