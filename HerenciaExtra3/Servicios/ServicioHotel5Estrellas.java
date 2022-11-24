
package Servicios;

import EntidadBisNieta.Hotel5Estrellas;
import EntidadesNietas.Hotel4Estrellas;
import java.util.ArrayList;

public final class ServicioHotel5Estrellas extends ServicioHotel {
    public void precioHabitacion(Hotel5Estrellas h){
        super.precioHabitacion(h);
        h.setPrecio(h.getPrecio()+(h.getLimosinas()*15)+h.getSuites());
    }
    public void mostrarPrecio(Hotel5Estrellas h){
        super.precioHabitacion(h);
         System.out.println("Habitacion "+h.getPrecio()+"USD por noche");
        System.out.println("Suit "+(h.getPrecio()+h.getPrecioSuites())+"USD por noche");
    }
        public void mostrarListado(ArrayList <Hotel5Estrellas> lista5,ArrayList <Hotel4Estrellas> lista4){
            for (int i = 0; i < 5; i++) {
                System.out.println(lista5.get(i));
                precioHabitacion(lista5.get(i));
                mostrarPrecio(lista5.get(i));
                System.out.println(" ");
            }
            for (int i = 0; i < 5; i++) {
                 System.out.println(lista4.get(i));
                precioHabitacion(lista4.get(i));
                mostrarPrecio4(lista4.get(i));
                System.out.println(" ");
            }
    }
}
