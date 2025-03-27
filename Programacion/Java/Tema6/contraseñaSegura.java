package Tema6;
import java.util.Scanner;

public class contraseñaSegura {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca una contraseña: ");
        String contraseña = teclado.nextLine();
        teclado.close();

      
        if (contraseña.length() >= 8) {
            boolean tieneMayuscula = false;
            boolean tieneMinuscula = false;
            boolean tieneNumero = false;
            boolean tieneEspecial = false;

            String caracteresEspeciales = "@#$%&*!";

         
            for (char caracter : contraseña.toCharArray()) {
                if (Character.isUpperCase(caracter)) {
                    tieneMayuscula = true;
                } else if (Character.isLowerCase(caracter)) {
                    tieneMinuscula = true;
                } else if (Character.isDigit(caracter)) {
                    tieneNumero = true;
                } else if (caracteresEspeciales.contains(String.valueOf(caracter))) {
                    tieneEspecial = true;
                }
            }

    
            if (tieneMayuscula && tieneMinuscula && tieneNumero && tieneEspecial) {
                System.out.println("La contraseña es segura.");
            } else {
                System.out.println("La contraseña no cumple con los requisitos.");
            }
        } else {
            System.out.println("La contraseña debe tener al menos 8 caracteres.");
        }
    }
}

