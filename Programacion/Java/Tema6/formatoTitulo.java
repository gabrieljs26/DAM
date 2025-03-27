package Tema6;
public class formatoTitulo {
    public static void main(String[] args) {
        String frase = "java es un lenguaje de programacion";
        String[] frase1 = frase.split(" ");

        for (int i = 0; i < frase1.length; i++) {

            char primeraLetra = frase1[i].charAt(0);
            
        
            if (Character.isLowerCase(primeraLetra)) {
                frase1[i] = Character.toUpperCase(primeraLetra) + frase1[i].substring(1);
            }
        }
        
    
        String resultado = String.join(" ", frase1);
        System.out.println( resultado );
    }
}
    

