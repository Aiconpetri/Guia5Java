
package Utilidades;

import EntidadBisNieta.Hotel5Estrellas;
import EntidadesNietas.Hotel4Estrellas;

import java.util.Comparator;

public class utilidadHotel {
    public static Comparator <Hotel5Estrellas> comparaPrecio5=new Comparator<Hotel5Estrellas>(){
        @Override
        public int compare(Hotel5Estrellas t1, Hotel5Estrellas t) {
           return t.getPrecio().compareTo(t1.getPrecio());
        }       
    };
     public static Comparator <Hotel4Estrellas> comparaPrecio4=new Comparator<Hotel4Estrellas>(){
        @Override
        public int compare(Hotel4Estrellas t1, Hotel4Estrellas t) {
           return t.getPrecio().compareTo(t1.getPrecio());
        }       
    };
}
