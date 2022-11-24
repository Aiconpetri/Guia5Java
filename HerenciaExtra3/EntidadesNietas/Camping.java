
package EntidadesNietas;

import EntidadesHijas.Extrahotelero;
public final class Camping extends Extrahotelero {
    private Integer carpas;
    private Integer banios;
    private String Restaurant;

    public Camping() {
    }
    public Camping(Integer carpas, Integer banios, String Restaurant, String privado, Integer metros, String nombre, String direccion, String localidad, String gerente) {
        super(privado, metros, nombre, direccion, localidad, gerente);
        this.carpas = carpas;
        this.banios = banios;
        this.Restaurant = Restaurant;
    }

    public Integer getCarpas() {
        return carpas;
    }

    public void setCarpas(Integer carpas) {
        this.carpas = carpas;
    }

    public Integer getBanios() {
        return banios;
    }

    public void setBanios(Integer banios) {
        this.banios = banios;
    }

    public String getRestaurant() {
        return Restaurant;
    }

    public void setRestaurant(String Restaurant) {
        this.Restaurant = Restaurant;
    }

    @Override
    public String toString() {
        return "Alojamiento ExtraHotelero Camping{"+super.toString()+"\n"+
                "Cantidad de carpas=" + carpas + ", Cantidad de banios=" + banios + ", Restaurant en instalaciones=" + Restaurant + '}';
    }
    
}
