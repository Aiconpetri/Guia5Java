
package EntidadPadre;

public class Electrodomestico {
    protected String color;
    protected char consumo;
    protected Integer peso;
    protected Double precio;

    public Electrodomestico() {
    }

    public Electrodomestico(String color, char consumo, Integer peso, Double precio) {
        this.color = color;
        this.consumo = consumo;
        this.peso = peso;
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumo() {
        return consumo;
    }

    public void setConsumo(char consumo) {
        this.consumo = consumo;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
    
}
