package Clases;

import java.util.ArrayList;
import java.util.Scanner;

public class ClaseInventario {

    // Clase Producto
    public static class Producto {
        String nombre;
        int precio;
        int cantidad;
        int valorIncremento;
        int valorBajado;

        public Producto(String nombre, int precio, int cantidad, int valorIncremento, int valorBajado) {
            this.nombre = nombre;
            this.precio = precio;
            this.cantidad = cantidad;
            this.valorIncremento = valorIncremento;
            this.valorBajado = valorBajado;
        }

        public int incrementar() {
            cantidad += valorIncremento;
            return cantidad;
        }

        public int decrementar() {
            cantidad -= valorBajado;
            return cantidad;
        }

        public void mostrarInfo() {
            System.out.println("Producto: " + nombre + " | Precio: " + precio + " | Cantidad: " + cantidad);
        }
    }

    // Lista de productos en el inventario
    static ArrayList<Producto> inventario = new ArrayList<>();

    // Método para agregar un producto
    public static void agregarProducto(String nombre, int precio, int cantidad, int valorIncremento, int valorBajado) {
        inventario.add(new Producto(nombre, precio, cantidad, valorIncremento, valorBajado));
    }

    // Método para mostrar todos los productos
    public static void mostrarInventario() {
        System.out.println("\n--- Inventario ---");
        for (Producto p : inventario) {
            p.mostrarInfo();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Agregando productos de prueba
        agregarProducto("Laptop", 1200, 5, 2, 1);
        agregarProducto("Mouse", 25, 25, 5, 2);
        agregarProducto("Teclado", 45, 15, 3, 1);

        while (true) {
            System.out.println("\nMenú de Inventario:");
            System.out.println("1. Ver productos");
            System.out.println("2. Agregar producto");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            
            int opcion = scanner.nextInt();
            scanner.nextLine(); 

            if (opcion == 1) {
                mostrarInventario();
            } else if (opcion == 2) {
                System.out.print("Nombre del producto: ");
                String nombre = scanner.nextLine();
                System.out.print("Precio: ");
                int precio = scanner.nextInt();
                System.out.print("Cantidad: ");
                int cantidad = scanner.nextInt();
                System.out.print("Valor de incremento: ");
                int valorIncremento = scanner.nextInt();
                System.out.print("Valor de decremento: ");
                int valorBajado = scanner.nextInt();

                agregarProducto(nombre, precio, cantidad, valorIncremento, valorBajado);
                System.out.println("Producto agregado con éxito.");
            } else if (opcion == 3) {
                System.out.println("Saliendo del sistema...");
                break;
            } else {
                System.out.println("Opción no válida, intente de nuevo.");
            }
        }
        scanner.close();
    }
}
