public class contadorPalabras {



    public static void main (String[]args){

        //Escribe un programa que cuente cuántas palabras hay en una frase.
        //Ejemplo de entrada:
        //Aprender Java es divertido
        //Salida esperada:
        //Número de palabras: 4


            String frase = "Aprender Java es divertido";
            String [] resultado = frase.split(" "); // {Aprender, Java, es, divertido}
            int  contador = 0;

            for (String palabra : resultado ) 
            {
                System.out.println(contador + " " + palabra);
                contador++;
            }

            System.out.println("La frase tiene " + contador + " palabras ");
            
}

}