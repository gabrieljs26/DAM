package Tema6;
public class mayusMinus {

    public static void main (String[]args) {
    

        //Solicita al usuario un texto y muestra su versión en mayúsculas y en minúsculas.
        //Ejemplo de entrada:
        //Hola Mundo
        //Salida esperada:
        //Mayúsculas: HOLA MUNDO 
        //Minúsculas: hola mundo

        String frase = "Hola Mundo";
        String mayuscula = frase.toUpperCase();
        String minuscula =  frase.toLowerCase();

        System.out.println("La frase en mayuscula es : " + mayuscula);
        System.out.println("La frase en minuscula es : " + minuscula);
    }
    
}
