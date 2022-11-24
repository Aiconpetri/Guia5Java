
package EntidadesHijas;

import EntidadPadre.Electrodomestico;

public final class Televisor extends Electrodomestico {
    private Integer pulgadas;
    private boolean TDT;

    public Televisor() {
    }
    public Televisor(Integer pulgadas, boolean TDT, String color, char consumo, Integer peso, Double precio) {
        super(color, consumo, peso, precio);
        this.pulgadas = pulgadas;
        this.TDT = TDT;
    }

    public Integer getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(Integer pulgadas) {
        this.pulgadas = pulgadas;
    }

    public boolean isTDT() {
        return TDT;
    }

    public void setTDT(boolean TDT) {
        this.TDT = TDT;
    }

  
    
}
