package Clases;

public class ClaseRectangulo {

    double base;
    double altura;

    public ClaseRectangulo(double base , double altura){

        this.base = base ;
        this.altura = altura;
    }

    public double perimetro()
    {

    return 2 * base * altura ;
        
    }

    public double area()
    {
        return base * altura ;
    }

    public void mostrarResultados(){

        System.out.println("La base de el rectangulo es " + area() );
        System.out.println("El perimetro de el rectangulo es: " + perimetro());
    }

}
