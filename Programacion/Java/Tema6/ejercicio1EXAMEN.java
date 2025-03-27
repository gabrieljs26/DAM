package Tema6;
import java.util.Arrays;
import java.util.Scanner;

public class ejercicio1EXAMEN {
    public static void main(String[] args)
    //Define una matriz bidimensional que represente filas y columnas.
    //Inicializa cada posición con un valor que indique asiento libre (por ejemplo, 0).
    //Implementa un metodo que reciba la ubicación (fila, columna) y reserve el asiento (cambiando su valor, por ejemplo, a 1)


    {

        Scanner input = new Scanner(System.in);
        //Creacion de la matriz

        System.out.println("Ingrese un numero de filas: ");
        int filas = input.nextInt();
        System.out.println("Ingrese un numero de columnas: ");
        int columnas = input.nextInt();

        int[][] asientos = {};
        asientos = new int[filas][columnas];
        System.out.println(Arrays.deepToString(asientos));

        while (true) {

            System.out.println("----MENU---");
            System.out.println("1.Reservar asiento");
            System.out.println("2.Cancelar reservar");
            System.out.println("3.Consultar disponibilidad");
            System.out.println("4.Busqueda de asientos contiguos");
            System.out.println("5.Salir");
            int opcion = input.nextInt();


            if (opcion == 1) {
                //Reservar Asientos
                System.out.println("Introduzca el asiento en la fila que quiere reservar:");
                int filaResevar = input.nextInt();
                System.out.println("Introduzca el asiento en la columna que quiere reservar:");
                int columnaResevar = input.nextInt();
                asientos[filaResevar][columnaResevar] = 1;
                System.out.println("Ha reservado el asiento : " + (asientos[filaResevar][columnaResevar]));
                System.out.println(Arrays.deepToString(asientos));
            }


            //Cancelacion de la reserva
            if (opcion == 2) {

                System.out.println("Introduzca el asiento en la fila que quiere reservar:");
                int filaResevar = input.nextInt();
                System.out.println("Introduzca el asiento en la columna que quiere reservar:");
                int columnaResevar = input.nextInt();

                if (asientos[filaResevar][columnaResevar] == 1) {
                    System.out.println("Se ha cancelado la reserva");
                    asientos[filaResevar][columnaResevar] = 0;
                }
                else {
                    System.out.println("El asiento esta libre");
                }

            }

            if (opcion == 3) {
                int contadorLibre = 0;
                int contadorReserva = 0;
                for (int i = 0; i < filas; i++) {
                    for (int j = 0; j < columnas; j++) {
                        if (asientos[i][j] == 0) {
                            contadorLibre++;
                        }
                        if (asientos[i][j] == 1) {
                            contadorReserva++;
                        }


                    }
                }
                System.out.println("Asientos Libres: " + contadorLibre
                + "\nAsientos Reservas: " + contadorReserva);
            }
            if (opcion == 4) {
                System.out.println("¿Cuantos asientos contiguos quiere?: ");
                int asientoscontiguos = input.nextInt();
                int contadorasientoscontiguos = 0;
                int contadornohayasientos = 0;
                for (int i = 0; i < filas; i++) {
                    for (int j = 0; j < columnas; j++) {

                        if (asientos[i][j] == 1) {
                            for (int k = asientos[i][j]; k <=filas ; k++) {

                                if (k == asientoscontiguos) {
                                   contadorasientoscontiguos++;
                                }
                                else {
                                    contadornohayasientos++;
                                }
                            }


                        }
                        if (asientos[i][j] == 0) {
                            contadorasientoscontiguos++;
                        }
                    }

                }
                if (contadorasientoscontiguos > 0) {
                    System.out.println("Si hay asientos contiguos");
                };
                if (contadorasientoscontiguos == 0) {
                    System.out.println("No hay asientos contiguos");
                };

            }
            if (opcion == 5) {
                break;
            }

        }
    }
}