package ExpresionesRegulares;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class extraccionNum {
 
    public static void main(String[] args) {
        
        //Desarrolla un programa en Java que reciba una cadena de texto y extraiga todos los números enteros que contenga.
        //Utiliza el método find() del objeto Matcher para localizar cada ocurrencia.
        //Puntos a considerar:
        //Imprime cada número encontrado junto con su posición de inicio y fin dentro del texto.
        //Asegúrate de que se detecten números que estén aislados o incrustados en medio de otras letras.

        String texto = "h0l4 m3 ll4m0 g4b1";
        String patron = "\"\\d\"g";

        Pattern pattern = Pattern.compile(patron);
        Matcher matcher = pattern.matcher(texto);
        String nuevoString = matcher.replaceAll("[Numeros]");
        System.out.println(nuevoString);
    }





}
