
package EntidadesNietas;

import EntidadesHijas.Extrahotelero;
public final class Residencia extends Extrahotelero {
    private Integer habitaciones;
    private String descuento;
    private String campo;

    public Residencia() {
    }

    public Residencia(Integer habitaciones, String descuento, String campo, String privado, Integer metros, String nombre, String direccion, String localidad, String gerente) {
        super(privado, metros, nombre, direccion, localidad, gerente);
        this.habitaciones = habitaciones;
        this.descuento = descuento;
        this.campo = campo;
    }
    public Integer getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(Integer habitaciones) {
        this.habitaciones = habitaciones;
    }

    public String getDescuento() {
        return descuento;
    }

    public void setDescuento(String descuento) {
        this.descuento = descuento;
    }

    public String getCampo() {
        return campo;
    }

    public void setCampo(String campo) {
        this.campo = campo;
    }

    @Override
    public String toString() {
        return "Alojamiento ExtraHotelero Residencia{"+super.toString()+"\n"+
                "Cantidad de habitaciones=" + habitaciones + ", Descuento para miembros=" + descuento + ", Campo deportivo=" + campo + '}';
    }
    
}
