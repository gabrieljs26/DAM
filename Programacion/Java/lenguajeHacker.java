import java.util.Scanner;

public class lenguajeHacker {
    public static void main(String[] args) {
        // Scanner para entrada del usuario
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una oración: ");
        String frase = scanner.nextLine();
        scanner.close();

        
        String resultado = frase.replaceAll("(?i)a", "4").replaceAll("(?i)b", "8")
                .replaceAll("(?i)c", "(").replaceAll("(?i)d", "\\|\\)")
                .replaceAll("(?i)e", "3").replaceAll("(?i)g", "6")
                .replaceAll("(?i)i", "1").replaceAll("(?i)l", "|_")
                .replaceAll("(?i)o", "0").replaceAll("(?i)s", "$")
                .replaceAll("(?i)t", "7").replaceAll("(?i)z", "2");

       
        System.out.println("Texto en lenguaje hacker: " + resultado);
    }
}
