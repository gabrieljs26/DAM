package Tema6;
import java.util.Scanner;

public class lenguajeHacker {
    public static void main(String[] args) {
        // Scanner para entrada del usuario
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una oración: ");
        String frase = scanner.nextLine();
        scanner.close();

        
        String resultado = frase.replace("a", "4").replace("b", "8")
                .replace("c", "(").replace("d", "barra")
                .replace("e", "3").replace("g", "6")
                .replace("i", "1").replace("l", "|_")
                .replace("o", "0").replace("s", "$")
                .replace("t", "7").replace("z", "2");

       
        System.out.println("Texto en lenguaje hacker: " + resultado);
    }
}
