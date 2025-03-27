package Tema6;
public class frecuenciaCaracter {


    public static void main(String[] args) {
        
        //Dada una cadena y un carácter, cuenta cuántas veces aparece dicho carácter en la cadena.
        //Ejemplo de Entrada
        //Ingrese una cadena: "programación en Java"
        //Ingrese un carácter: 'a'
        //Ejemplo de Salida
        //El carácter 'a' aparece 4 veces en la cadena.
     
     
        String frase = "programacion en java";
        char[] frase2 = frase.toCharArray();
        char caracterBuscado = 'a'; 
        int contador = 0;

        for (char c : frase2) {
            if (c == caracterBuscado) {
                contador++;
            }
        }

        System.out.println("El carácter '" + caracterBuscado + "' aparece " + contador + " veces en la cadena.");
    }
}