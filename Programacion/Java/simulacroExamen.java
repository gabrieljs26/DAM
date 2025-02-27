import java.util.Random;
import java.util.Scanner;

public class simulacroExamen {
    


    public static void main(String[] args) {
        
        String [] productos= {"Manzana", "Banana","Pera","Mango","Melocoton"};
    
        int [] stock = new int [productos.length];


        Random numrRandom = new Random();
        for ( int i = 0 ; i<stock.length ; i++){

            stock[i] = numrRandom.nextInt(20 , 100);
            System.out.println("El producto tiene: " + productos[i] +" " +  stock[i]);

        }
        System.out.println("Introduca un producto: ");
        Scanner teclado = new Scanner(System.in);
        String eleccion = teclado.nextLine();
        System.out.println("Ingrese la cantidad que va a actualizar: ");
        int stockActualizado = teclado.nextInt();

        for (int i = 0 ; i < productos.length ; i++ ){

            if (productos[i].equalsIgnoreCase(eleccion)) {
                stock[i] = stock[i]+stockActualizado;                
            

            if (stock[i]<0 ){
                stock[i]=0;
            }
            
            System.out.println("El stock de " + eleccion + " ha sido actualizado a: " + stock[i] + " unidades.");
            break;

            }
        }

        int maxStock = stock[0];
        String productoMaxStock = productos[0];
        for (int i = 1; i < stock.length; i++) {
            if (stock[i] > maxStock) {
                maxStock = stock[i];
                productoMaxStock = productos[i];
            }
        }

        System.out.println("El producto con mas stock es :" + productoMaxStock + " con " + maxStock +" unidades");



        for (int i = 0 ; i< stock.length; i++){


            if (stock[i] <= 40 ){

                System.out.println("Hay un producto que esta por debajo de 40 unidades: " + productos[i]);
            }
        }


            teclado.close();
        }


}

