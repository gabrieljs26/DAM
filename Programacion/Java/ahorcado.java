import java.util.Scanner;

public class ahorcado {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Jugador 1, ingresa tu palabra secreta: ");
        String palabraJugador1 = teclado.nextLine();
        limpiarConsola();
        System.out.println("Jugador 2, ingresa tu palabra secreta: ");
        String palabraJugador2 = teclado.nextLine();
        limpiarConsola();

        int intentosJugador1 = 0;
        int intentosJugador2 = 0;
        char[] palabraAdivinadaJugador1 = new char[palabraJugador1.length()];
        char[] palabraAdivinadaJugador2 = new char[palabraJugador2.length()];

        for (int i = 0; i < palabraAdivinadaJugador1.length; i++) {
            palabraAdivinadaJugador1[i] = '_';
        }
        for (int i = 0; i < palabraAdivinadaJugador2.length; i++) {
            palabraAdivinadaJugador2[i] = '_';
        }

        while (intentosJugador1 < 6 && intentosJugador2 < 6) {

            // Turno del Jugador 2
            System.out.println("Jugador 1, tu palabra: " + new String(palabraAdivinadaJugador1));
            System.out.println("Jugador 2, intenta adivinar una letra de la palabra del Jugador 1.");
            String entrada = teclado.nextLine().trim();

            limpiarConsola();
            if (entrada.length() != 1) {
                System.out.println("Por favor, ingresa solo una letra.");
                continue;
            }
            char letra1 = entrada.charAt(0); 

            boolean acertado = false;
            for (int i = 0; i < palabraJugador1.length(); i++) {
                if (palabraJugador1.charAt(i) == letra1 && palabraAdivinadaJugador1[i] == '_') {
                    palabraAdivinadaJugador1[i] = letra1;
                    acertado = true;
                }
                limpiarConsola();
            }

            if (acertado) {
                System.out.println("¡Correcto! La palabra hasta ahora es: " + new String(palabraAdivinadaJugador1));
            } else {
                System.out.println("¡Incorrecto! La letra no está en la palabra.");
                intentosJugador1++;
            }

            if (new String(palabraAdivinadaJugador1).equals(palabraJugador1)) {
                System.out.println("¡Jugador 2 ha adivinado la palabra!");
                break;
            }

    
            System.out.println("Jugador 2, tu palabra: " + new String(palabraAdivinadaJugador2));
            System.out.println("Jugador 1, intenta adivinar una letra de la palabra del Jugador 2.");
            entrada = teclado.nextLine().trim(); 
            if (entrada.length() != 1) {
                System.out.println("Por favor, ingresa solo una letra.");
                continue;
            }
            char letra2 = entrada.charAt(0); 

            acertado = false;
            for (int i = 0; i < palabraJugador2.length(); i++) {
                if (palabraJugador2.charAt(i) == letra2 && palabraAdivinadaJugador2[i] == '_') {
                    palabraAdivinadaJugador2[i] = letra2;
                    acertado = true;
                }
            }

            if (acertado) {
                System.out.println("¡Correcto! La palabra hasta ahora es: " + new String(palabraAdivinadaJugador2));
            } else {
                System.out.println("¡Incorrecto! La letra no está en la palabra.");
                intentosJugador2++;
            }

            if (new String(palabraAdivinadaJugador2).equals(palabraJugador2)) {
                System.out.println("¡Jugador 1 ha adivinado la palabra!");
                break;
            }

            if (intentosJugador1 == 6) {
                System.out.println("Jugador 2 ha agotado sus intentos. ¡Jugador 1 gana!");
                break;
            }

            if (intentosJugador2 == 6) {
                System.out.println("Jugador 1 ha agotado sus intentos. ¡Jugador 2 gana!");
                break;
            }
        }

        teclado.close();
    }



    
                public static void limpiarConsola() 
{
    System.out.print("\033[H\033[2J");
    System.out.flush();
}

}
