package Tema6;
import javax.swing.*;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ejercicio2EXAMEN {

    public static void main(String[] args) {
        //Implementa una función que detecte y valide
        // números de teléfono en el formato "XXX-XXX-XXXX".
        // Esta función tiene que decir si el número testeado es válido o no.

        Scanner sc = new Scanner(System.in);
        while (true) {

            System.out.println("Introduca el numero de telefono");
            String telefono = sc.nextLine();
            System.out.println(telefono);


            String[] correcto = {};
            String [] ocultado = {telefono};
            correcto = telefono.split("-");


                if (correcto[0].length() == 3 && correcto[1].length() == 3 && correcto[2].length() == 4) {
                    System.out.println("El fomato es valido");
                }
                else {
                    System.out.println("El fomato no es valido");
                }


            for (int i = 0 ; i < telefono.length() -4 ; i++) {

                System.out.print(telefono.toCharArray()[i] );


            }
            for (int i = 8 ; i < telefono.length() ; i++) {

                System.out.print("*");


            }


            }

        }
    }
