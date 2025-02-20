public class contadorCaracteres {
    public static void main(String[] args) {
        String cadena = "aaabbccccdd";
        String resultado = "";
        
        char actual = cadena.charAt(0); 
        int contador = 1;
        
        for (int i = 1; i < cadena.length(); i++) {
            if (cadena.charAt(i) == actual) {
                contador++;
            } else {
                resultado += actual + "" + contador;
                actual = cadena.charAt(i);
                contador = 1;
            }
        }
        
        System.out.println(resultado + actual + contador);
    }
    
}

