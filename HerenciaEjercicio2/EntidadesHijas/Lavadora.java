
package EntidadesHijas;

import EntidadPadre.Electrodomestico;

public final class Lavadora extends Electrodomestico{
    private Integer carga;

    public Lavadora() {
    }

    public Lavadora(Integer carga, String color, char consumo, Integer peso, Double precio) {
        super(color, consumo, peso, precio);
        this.carga = carga;
    }
    public Integer getCarga() {
        return carga;
    }

    public void setCarga(Integer carga) {
        this.carga = carga;
    }
    
}
