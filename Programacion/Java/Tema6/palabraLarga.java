package Tema6;
public class palabraLarga {


    public static void main (String[]args){

        //Escribe un programa en Java que solicite al usuario un párrafo y determine cuál es la palabra más larga dentro de él.

        //Ejemplo de entrada:
        //Ingrese un párrafo: Java es un lenguaje de programación muy poderoso y ampliamente utilizado en el desarrollo de software.
        //Salida esperada:
        //La palabra más larga es: "programación"

        String frase ="Java es un lenguaje de programación muy poderoso y ampliamente utilizado en el desarrollo de software.";
       
       
        String [] resultado = frase.split(" ");

        String palabraLarga ="";

        for (String palabra : resultado){

        if ( palabraLarga.length()< palabra.length()){

                palabraLarga=palabra;
        }

    }

    System.out.println("La palabra mas larga es: " + palabraLarga);
    }
    
}
