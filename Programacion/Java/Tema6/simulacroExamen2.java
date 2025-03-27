package Tema6;


import java.util.Scanner;
import java.util.regex.Pattern;

public class simulacroExamen2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca una contraseña");
        String contraseña = scanner.nextLine();
        String patron = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9]).+$";

        if (contraseña.length() > 6) {

            if (Pattern.matches(patron, contraseña)) {
                System.out.println("La contraseña es segura");
            } else {
                System.out.println("La contraseña no cumple los requisitos");
            }



        } else {
            System.out.println("La contraseña es demasiado corta");
        }


        System.out.println("Introduzca la subcadena que desea buscar:");
        String subcadena = scanner.nextLine();

        // Buscar el índice de la subcadena en la contraseña
        int indice = contraseña.indexOf(subcadena);

        // Mostrar el resultado
        if (indice != -1) {
            System.out.println("La subcadena se encuentra en la posición: " + indice);
        } else {
            System.out.println("La subcadena no se encuentra en la contraseña.");

        }
    }
}
