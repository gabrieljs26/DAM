import java.util.Scanner;

public class eliminacionCaracter {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Ingrese una cadena: ");
        String entrada = scanner.nextLine();
        
        String resultado = ""; 
        

        for (int i = 0; i < entrada.length(); i++) {
            char caracter = entrada.charAt(i);
            
            if (resultado.indexOf(caracter) == -1) {
                resultado += caracter; 
            }
        }
        
        
        System.out.println("Cadena sin caracteres repetidos: " + resultado);
        
        scanner.close();
    }
}