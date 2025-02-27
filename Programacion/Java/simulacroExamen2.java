import java.util.Scanner;
import java.util.regex.Pattern;

public class simulacroExamen2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
     
        System.out.print("Ingrese un código de acceso: ");
        String codigo = scanner.nextLine();

        if (codigo.length() < 6) {
            System.out.println("Error: El código debe tener al menos 6 caracteres.");
        } else if (!validarComplejidad(codigo)) {
            System.out.println("Error: El código debe incluir al menos una letra minúscula, una letra mayúscula y un dígito.");
        } else {
            System.out.println("Código válido.");
            

            String codigoEnmascarado = enmascararCodigo(codigo);
            System.out.println("Código enmascarado: " + codigoEnmascarado);

        
            System.out.print("Ingrese una subcadena para buscar: ");
            String subcadena = scanner.nextLine();
            buscarSubcadena(codigo, subcadena);
        }
        
        scanner.close();
    }


    public static boolean validarComplejidad(String codigo) {
        String patron = "^(?=.*[0-9])(?=.*[A-Z])(?=.*[a-z]).{6,}$";
        return Pattern.matches(patron, codigo);
    }

 
    public static String enmascararCodigo(String codigo) {
        if (codigo.length() <= 4) {
            return codigo; 
        }
        String inicio = codigo.substring(0, 2);
        String fin = codigo.substring(codigo.length() - 2);
        String asteriscos = "*".repeat(codigo.length() - 4);
        return inicio + asteriscos + fin;
    }

   
    public static void buscarSubcadena(String codigo, String subcadena) {
        int indice = codigo.indexOf(subcadena);
        if (indice != -1) {
            System.out.println("La subcadena se encuentra en la posición: " + indice);
        } else {
            System.out.println("La subcadena no fue encontrada en el código.");
        }
    }
}
