
package EntidadBisNieta;

import EntidadesNietas.Hotel4Estrellas;


public final class Hotel5Estrellas extends Hotel4Estrellas {
    private Integer salones;
    private Integer suites;
    private Integer precioSuites;
    private Integer limosinas;

    public Hotel5Estrellas() {
    }

    public Hotel5Estrellas(Integer salones, Integer suites, Integer precioSuites, Integer limosinas, String nombreRestaurant, Integer capacidadR, String gimnasio, Integer estrellas, Integer habitaciones, Integer camas, Integer pisos, Integer precio, String nombre, String direccion, String localidad, String gerente) {
        super(nombreRestaurant, capacidadR, gimnasio, estrellas, habitaciones, camas, pisos, precio, nombre, direccion, localidad, gerente);
        this.salones = salones;
        this.suites = suites;
        this.precioSuites = precioSuites;
        this.limosinas = limosinas;
    }
    public Integer getSalones() {
        return salones;
    }

    public void setSalones(Integer salones) {
        this.salones = salones;
    }

    public Integer getSuites() {
        return suites;
    }

    public void setSuites(Integer suites) {
        this.suites = suites;
    }

    public Integer getPrecioSuites() {
        return precioSuites;
    }

    public void setPrecioSuites(Integer precioSuites) {
        this.precioSuites = precioSuites;
    }

    public Integer getLimosinas() {
        return limosinas;
    }

    public void setLimosinas(Integer limosinas) {
        this.limosinas = limosinas;
    }

    @Override
    public String toString() {
        return "" +super.toString()+ "Cantidad de salones de conferencia=" + salones + ",Cantidad de Suites=" + suites + ", Precio extra por Suite=" + precioSuites +"USD "+ ", Cantidad de limosinas=" + limosinas + '}';
    }
    
}
