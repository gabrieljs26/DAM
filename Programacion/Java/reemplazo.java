public class reemplazo {


    public static void main (String[]args){

            //Solicita al usuario una oración y reemplaza todas las ocurrencias de la palabra "Pascal" por "Java ".

            //Ejemplo de entrada:

            //Me encanta programar en Pascal. Pascal es genial.
            //Salida esperada:

            //Me encanta programar en Java. Java es genial.

            String frase = "Me encanta programar en Pascal. Pascal es genial.";

            String resultado = frase.replaceAll("Pascal" , "Java");

            System.out.println(resultado);




    }
    
}
