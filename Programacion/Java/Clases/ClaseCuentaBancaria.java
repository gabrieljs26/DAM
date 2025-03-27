package Clases;

import java.util.Scanner;

public class ClaseCuentaBancaria {
    Scanner teclado = new Scanner(System.in);
    String titular ;
    double sueldo ;

    public ClaseCuentaBancaria(String titular , double sueldo){
        this.titular = titular ;
        this.sueldo = sueldo ;
    }

    public double depositar (){
        System.out.println("Introduzca la cantidad que va a depositar:");
       
        double deposito = teclado.nextDouble();

        return sueldo + deposito;
    }

    public double retirar(){
        System.out.println("Introduzca la cantidad que va a retirar:");
        double retiro = teclado.nextDouble();
        return sueldo - retiro ;
    }
}
