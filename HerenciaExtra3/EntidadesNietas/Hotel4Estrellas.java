
package EntidadesNietas;

import EntidadesHijas.Hotel;

public class Hotel4Estrellas extends Hotel {
    protected String nombreRestaurant;
    protected Integer capacidadR;
    protected String gimnasio;
    protected Integer estrellas;

    public Hotel4Estrellas() {
    }

    public Hotel4Estrellas(String nombreRestaurant, Integer capacidadR, String gimnasio, Integer estrellas, Integer habitaciones, Integer camas, Integer pisos, Integer precio, String nombre, String direccion, String localidad, String gerente) {
        super(habitaciones, camas, pisos, precio, nombre, direccion, localidad, gerente);
        this.nombreRestaurant = nombreRestaurant;
        this.capacidadR = capacidadR;
        this.gimnasio = gimnasio;
        this.estrellas = estrellas;
    }
    public String getNombreRestaurant() {
        return nombreRestaurant;
    }

    public void setNombreRestaurant(String nombreRestaurant) {
        this.nombreRestaurant = nombreRestaurant;
    }

    public Integer getCapacidadR() {
        return capacidadR;
    }

    public void setCapacidadR(Integer capacidadR) {
        this.capacidadR = capacidadR;
    }

    public String getGimnasio() {
        return gimnasio;
    }

    public void setGimnasio(String gimnasio) {
        this.gimnasio = gimnasio;
    }

    public Integer getEstrellas() {
        return estrellas;
    }

    public void setEstrellas(Integer estrellas) {
        this.estrellas = estrellas;
    }

    @Override
    public String toString() {
        return "Alojamiento Hotel "+ estrellas+" Estrellas{"+super.toString() +"\n"+
                "Nombre del Restaurant=" + nombreRestaurant + ", Capacidad del Restaurant=" + capacidadR + ",Calidad del gimnasio=" + gimnasio + '}';
    }
    
}
