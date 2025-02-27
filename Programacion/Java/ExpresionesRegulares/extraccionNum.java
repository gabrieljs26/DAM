package ExpresionesRegulares;


import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class extraccionNum {
    public static void main(String[] args) {
        //Desarrolla un programa en Java que reciba una cadena de texto y extraiga todos los números enteros que contenga.
        //Utiliza el método find() del objeto Matcher para localizar cada ocurrencia.
        //Puntos a considerar:
        //Imprime cada número encontrado junto con su posición de inicio y fin dentro del texto.
        //Asegúrate de que se detecten números que estén aislados o incrustados en medio de otras letras.

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese un texto con números incrustados:");
        String texto = scanner.nextLine();
    
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(texto);

        while (matcher.find()) {
            System.out.println("Número encontrado: " + matcher.group() +
                               " (Posición: " + matcher.start() + " - " + matcher.end() + ")");
        }

        scanner.close();
    }
}