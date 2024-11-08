package CompraVenta;


import javax.swing.*;
import java.io.IOException;

public class CompraVenta {
    int alto = 30;
    int largo = 20;
    int sleep = 150;
    int veces = 5;
    int duracion = 5;

    String[][] tablaF = new String[alto][largo];
    String[][] tabla1 = new String[alto][largo];
    String[][] tabla2 = new String[alto][largo];


    public static void clearScreen() {
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

        for (int i = 0; i < tablaF.length; i++) {
            for (int j = 0; j < tablaF[1].length; j++) {

                if (i == 0 || i == (alto - 1)) {
                    tablaF[i][j] = "*";
                } else if (j == 0 || j == (largo - 1)) {
                    tablaF[i][j] = "*";
                } else {
                    tablaF[i][j] = " ";
                    if (j < largo) {
                        tablaF[alto / 2][j] = "*";
                    }
                }
                System.out.print(tablaF[i][j] + " ");

            }
            System.out.println();
        }
    }

    void tablaHash() {

        for (int i = 0; i < tabla1.length; i++) {
            for (int j = 0; j < tabla1[1].length; j++) {

                if (i == 0 || i == (alto - 1)) {
                    if (j % 2 != 0) {
                        tabla1[i][j] = "*";
                    } else {
                        tabla1[i][j] = " ";
                        if (j < largo-1 && j > 0) {
                            tabla1[alto / 2][j] = "*";
                        }
                    }

                } else if (j == 0 || j == (largo - 1)) {
                    if (i % 2 != 0) {
                        tabla1[i][j] = "*";
                    } else {
                        tabla1[i][j] = " ";
                        if (j < largo-1 && j > 0) {
                            tabla1[alto / 2][j] = "*";
                        }
                    }
                } else {
                        tabla1[i][j] = " ";
                    if (j < largo-1 && j > 0) {
                        tabla1[alto / 2][j] = "*";
                    }
                }
                System.out.print(tabla1[i][j] + " ");

            }
            System.out.println();
        }
    }

    void tablaHash2() {

        for (int i = 0; i < tabla2.length; i++) {
            for (int j = 0; j < tabla2[1].length; j++) {

                if (i == 0 || i == (alto - 1)) {
                    if (j % 2 == 0) {
                        tabla2[i][j] = "*";
                    } else {
                        tabla2[i][j] = " ";
                        if (j < largo-1 && j > 0) {
                            tabla2[alto / 2][j] = "*";
                        }
                    }

                } else if (j == 0 || j == (largo - 1)) {
                    if (i % 2 == 0) {
                        tabla2[i][j] = "*";
                    } else {
                        tabla2[i][j] = " ";
                        if (j < largo-1 && j > 0) {
                            tabla2[alto / 2][j] = "*";
                        }
                    }
                } else {
                    tabla2[i][j] = " ";
                    if (j < largo - 1 && j > 0) {
                        tabla2[alto / 2][j] = "*";
                    }
                }
                System.out.print(tabla2[i][j] + " ");
            }
            System.out.println();
        }
    }


    void print1(int veces, int sleep) throws InterruptedException {

        while (veces != 0) {
            this.tablaHash();
            Thread.sleep(sleep);
            clearScreen();
            this.tablaHash2();
            Thread.sleep(sleep);
            clearScreen();
            veces--;
        }
    }

    void print2(int veces, int sleep) throws InterruptedException {

        while (veces != 0) {
            this.tablaHash2();
            Thread.sleep(sleep);
            clearScreen();
            this.tablaHash();
            Thread.sleep(sleep);
            clearScreen();
            veces--;
        }
    }

    void printIntermedio() throws InterruptedException {

        for (int i = 0; i < 3; i++) {
            clearScreen();
            Thread.sleep(450);
            this.tablaFull();
            Thread.sleep(450);
        }
    }

    void start() throws InterruptedException {

        while (duracion != 0 ) {
            print1(veces, sleep);
            printIntermedio();
            print2(veces, duracion);
            duracion--;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        CompraVenta tabla = new CompraVenta();
        tabla.start();



    }

}







