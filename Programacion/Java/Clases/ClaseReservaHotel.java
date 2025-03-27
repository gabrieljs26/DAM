package Clases;
import java.util.*;

import Clases.Habitacion.Estado;
import Clases.Habitacion.TipoHab;

public class ClaseReservaHotel {
    
    static ArrayList<Habitacion> reservas = new ArrayList <>();

    public static void agregarReserva(int numero ,  String tipoEnum , String estadoEnum){

        reservas.add(new Habitacion(numero, tipoEnum, estadoEnum ));
    }

    public static void mostrarReservas (){

        System.out.println("Reservas:");

        for (Habitacion p : reservas){
            p.mostrarInfo();
        }
    }
    public void convertirString (){

        
    }



    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Agregando productos de prueba
        agregarReserva(101 ,  , Estado.Disponible);
        agregarReserva (202,TipoHab.Individual,Estado.Disponible);
    

        while (true) {
            System.out.println("\nMenú de Reservas:");
            System.out.println("1. Ver reservas");
            System.out.println("2. Agregar reservas");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            
            int opcion = scanner.nextInt();
            scanner.nextLine(); 

            if (opcion == 1) {
                mostrarReservas();
            } else if (opcion == 2) {
                System.out.print("Numero de la Habitacion: ");
                int numero = scanner.nextInt();
                System.out.print("Tipo: ");
                String tipoEnum = scanner.nextLine();
                System.out.print("Estado: ");
                String estadoEnum = scanner.nextLine();
               

                agregarReserva(numero, tipoEnum , estadoEnum );
                System.out.println("Reserva agregado con éxito.");
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
