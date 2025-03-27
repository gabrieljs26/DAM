package Clases;

public class ClaseCoche {
    String marca ;
    String modelo ; 
    int anio ;

    public ClaseCoche(String marca , String modelo , int anio){

        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;

    }

    public void mostrarInfo(){

        System.out.println("Su coche es de la marca:" + marca + ", del modelo :" + modelo + " , y del año;" + anio);
    }



}
