package Clases;

import java.util.Arrays;

public class ClaseGestion {
    

   public class Empleado {
    private String nombre;
    private int id;
    private String puesto;

    public Empleado(String nombre, int id, String puesto) {
        this.nombre = nombre;
        this.id = id;
        this.puesto = puesto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String toString() {
        return "Empleado{ID=" + id + ", Nombre='" + nombre + ", Puesto='" + puesto + "'}";
    }
}


class Departamento {
    private String nombre;
    private Empleado[] empleados;
    private int contador;

    public Departamento(String nombre, int capacidad) {
        this.nombre = nombre;
        this.empleados = new Empleado[capacidad];
        this.contador = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Empleado[] getEmpleados() {
        return empleados;
    }

    public void agregarEmpleado(Empleado empleado) {
        if (contador < empleados.length) {
            empleados[contador++] = empleado;
        } else {
            System.out.println("No se pueden agregar más empleados al departamento " + nombre);
        }
    }

    
    public String toString() {
        return "Departamento{" + "nombre='" + nombre  + ", empleados=" + Arrays.toString(empleados) + '}';
    }
}

}
   