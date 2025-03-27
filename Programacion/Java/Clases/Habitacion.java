package Clases;

public class Habitacion 
{
        public enum Estado {Disponible, Ocupada}
        public enum TipoHab {Individual , Doble , Suite}
       public int numero ;
        public TipoHab tipo;
        public Estado estado ;
        
        public Habitacion(int numero , TipoHab tipo , Estado estado){

            this.numero = numero;
            this.tipo = tipo;
            this.estado = estado;
        
        }

        public void mostrarInfo(){
            System.out.println("Numero Habticacion | " + numero + "Tipo de habitacion | " + tipo + "Estado de la habitacion |" + estado);
        }

        public Estado getestado(Estado estado)
        {
            return estado;
        }
        public void setEstado(Estado estado)
        {
            this.estado = estado;
        }


        public TipoHab getTipo(TipoHab tipo)
        {
            return tipo ;
        }

        public void setTipo(TipoHab tipo)
        {
            this.tipo = tipo;
        }

        public int getNumero(int numero){
            return numero;
        }
        public void setNumero(int numero){
            this.numero = numero;
        }
        
}
