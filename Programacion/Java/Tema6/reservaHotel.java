package Tema6;
import java.util.Random;
import java.util.Scanner;

public class reservaHotel {
    
    public static void main(String[] args) {

        String [] productos = { "Platano", "Mango", "Pera" , "Manzana", "Kiwi"};

        int [] stock = new int [productos.length];
        Random numeroRandom = new Random();
        for ( int i = 0 ; i<productos.length ; i++){
            stock[i] = numeroRandom.nextInt(20,100);
            System.out.println("El producto tiene: " + productos[i] +" " +  stock[i]);
        }



        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduca un producto: ");
        String productoActualizar = teclado.nextLine();
        System.out.println("Introduzca una cantidad a actualizar: ");
        int stockactualizar = teclado.nextInt();

        for (int i = 0 ; i<productos.length ; i++){

            if (productos[i].equals(productoActualizar)){

                stock[i] = stock[i]+stockactualizar;

                if (stock[i]<0){
                    System.out.println("Se ha quedado sin stock");
                    break;
                }

                System.out.println("El producto tiene: " + productos[i] +" " +  stock[i]);
            }
        }

        String MaxProducto = "";
        int MaxStock = 0;
        for (int i = 0; i < stock.length ; i++){
            if (stock[i]>MaxStock){
                MaxStock = stock[i];
                MaxProducto = productos[i];
                System.out.println("El producto con mayor stock es: " + productos[i] +" " +  stock[i]);
            }
        }

        for (int i = 0; i < stock.length ; i++){
            if (stock[i]<30){
                System.out.println("El producto: " + productos[i] + " esta por debajo de 30 unidades");
            }
        }

    }







}
