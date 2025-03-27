package Clases;

public class ClasePersona  {
  
    String nombre ;
    int edad;

    public ClasePersona (String nombre , int edad){

        this.nombre = nombre;
        this.edad = edad; 
    }

    public void mostrarNombre() {
        System.out.println("Su nombre es:" + nombre);
    }
}


