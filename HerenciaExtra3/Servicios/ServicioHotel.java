package Servicios;

import EntidadesHijas.Hotel;
import EntidadesNietas.Hotel4Estrellas;
import Utilidades.utilidadHotel;
import java.util.ArrayList;
import java.util.Collections;

public class ServicioHotel {
utilidadHotel uh=new utilidadHotel();
    public void precioHabitacion(Hotel4Estrellas h) {
        h.setPrecio(50 + h.getHabitaciones());
        if (h.getCapacidadR() < 30) {
            h.setPrecio(h.getPrecio() + 10);
        } else if (h.getCapacidadR() < 50) {
            h.setPrecio(h.getPrecio() + 30);
        } else if (h.getCapacidadR()>50) {
            h.setPrecio(h.getPrecio() + 50);
        }
        if (h.getGimnasio().equalsIgnoreCase("A")){
            h.setPrecio(h.getPrecio()+50);
        }else{
            h.setPrecio(h.getPrecio()+30);
        }
    }
    public void mostrarPrecio4(Hotel h){
        System.out.println("Habitacion "+h.getPrecio()+"USD por noche");
    }
    public void compararPrecios(ArrayList lista1,ArrayList lista2){
        Collections.sort(lista1, uh.comparaPrecio5);
        Collections.sort(lista2, uh.comparaPrecio4);
    }
}
