
package EntidadesHijas;

import EntidadPadre.Alojamiento;

public class Hotel extends Alojamiento {
   protected Integer habitaciones;
   protected Integer camas;
   protected Integer pisos;
   protected Integer precio;
 

    public Hotel() {
    }

    public Hotel(Integer habitaciones, Integer camas, Integer pisos, Integer precio,  String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.habitaciones = habitaciones;
        this.camas = camas;
        this.pisos = pisos;
        this.precio = precio;
    }

    public Integer getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(Integer habitaciones) {
        this.habitaciones = habitaciones;
    }

    public Integer getCamas() {
        return camas;
    }

    public void setCamas(Integer camas) {
        this.camas = camas;
    }

    public Integer getPisos() {
        return pisos;
    }

    public void setPisos(Integer pisos) {
        this.pisos = pisos;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return ""+ super.toString() +"\n"+
                "Cantidad de habitaciones=" + habitaciones + ", Cantidad de camas=" + camas + ", Cantidad de pisos=" + pisos + '}';
    }
   
}
