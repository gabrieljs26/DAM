package Tema6;
import java.util.Arrays;


public class Polindroma {
    

    public static void main (String []args ){
        //Realizar un programa que lea una frase del teclado y nos indique si es palíndroma, es de­
        //cir, que la frase sea igual leyendo de izquierda a derecha, que de derecha a izquierda, sin
        //tener en cuenta los espacios. Un ejemplo de frase palíndroma es: 

        //"Dábale arroz a la zo­rra el abad"

        //Las vocales con tilde hacen que los algoritmos consideren una frase palíndroma como si
        //no lo fuese. Por esto, supondremos que el usuario introduce la frase sin tildes.


    
        String frase = "Dabale arroz a la zorra el abad";

        String fraseSinEspacios = frase.replaceAll("\\s+", "").toLowerCase();

        char[] frase1 = fraseSinEspacios.toCharArray();
        char[] frase2 = new char[frase1.length];

        for (int i = 0; i < frase1.length; i++) {
            frase2[i] = frase1[frase1.length - 1 - i];
        }

        if (Arrays.equals(frase1, frase2)) {
            System.out.println("La frase es palíndroma");
        } else {
            System.out.println("La frase no es palíndroma");
        }
    }
}