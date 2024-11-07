package CompraVenta;

public class PruebaEstrella {
    public static void main(String[] args) {
        Estrellas tabla = new Estrellas();
        Estrellas tabla1 = new Estrellas();

        while (2 > 1) {
            tabla.tablaHash();
            tabla.printTabla();
            System.out.print("\033[H\033[2J");
            System.out.flush();
            tabla1.tablaHash2();
            tabla1.printTabla();
        }

    }
}
