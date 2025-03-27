package Tema6;
import java.util.Arrays;

public class ordenarPalabras {



    public static void main(String[] args) {
        //Pide una oración al usuario y muestra las palabras ordenadas alfabéticamente.
        //Ejemplo de Entrada
        //Ingrese una oración: "Java es un lenguaje de programación"
        //Ejemplo de Salida
        //Palabras ordenadas: "Java de es lenguaje programación un"


        String frase = "pez araña avion bomba estallar ";
       
        String [] frase1 = frase.split(" ");
       
               
      Arrays.sort(frase1);
        for(String pala : frase1){
            System.out.println(pala);
        }
    }
    
}
