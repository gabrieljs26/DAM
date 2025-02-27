package ExpresionesRegulares;

import java.util.Scanner;
import java.util.regex.Pattern;

public class validacionContraseña {
    public static void main(String[] args) {
        //Implementa un programa en Java que verifique si una contraseña cumple con los siguientes requisitos de seguridad mediante expresiones regulares:

        //Longitud entre 8 y 20 caracteres.
        //Al menos una letra mayúscula.
        //Al menos una letra minúscula.
        //Al menos un dígito.
        //Al menos un carácter especial (por ejemplo: @, #, $, %, &, etc.).
            // (?=.*[a-z ])

        Scanner scanner = new Scanner(System.in);

        // Solicitar la contraseña al usuario
        System.out.print("Ingrese una contraseña: ");
        String contrasena = scanner.nextLine();

        
        String regex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@#$%^&+=!]).{8,20}$";

        
        if (Pattern.matches(regex, contrasena)) {
            System.out.println("La contraseña es segura.");
        } else {
            System.out.println(" La contraseña no cumple los requisitos de seguridad.");
        }

        scanner.close();
    }
}

    
    
    
    
    
    
    

