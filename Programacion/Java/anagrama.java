import java.util.Arrays;

public class anagrama {

    public static void main (String[] args){

    //Un anagrama es una palabra que resulta del cambio del orden de los caracteres de otra.
    //Ejemplos de anagramas para la palabra roma son: amor, ramo o mora. Construir un progra­
    //ma que solicite al usuario dos palabras e indique si son anagramas una de otra.


         String palabra1 = "roma";

        
        String palabra2 = "amor";

    
        char[] frase1 = palabra1.toCharArray();
        char[] frase2 = palabra2.toCharArray();

        
        Arrays.sort(frase1);
        Arrays.sort(frase2);

    
        if (Arrays.equals(frase1, frase2)) {
            System.out.println("Las palabras son anagramas.");
        } else {
            System.out.println("Las palabras no son anagramas.");
        }
    }
    
}
