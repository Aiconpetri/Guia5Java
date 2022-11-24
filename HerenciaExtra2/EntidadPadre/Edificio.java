
package EntidadPadre;
public abstract class Edificio {
   protected Integer ancho; 
   protected Integer alto;
   protected Integer largo;
   protected Integer superficie;
   protected Integer volumen;

    public Edificio() {
    }

    public Edificio(Integer ancho, Integer alto, Integer largo, Integer superficie, Integer volumen) {
        this.ancho = ancho;
        this.alto = alto;
        this.largo = largo;
        this.superficie = superficie;
        this.volumen = volumen;
    }
    public Integer getAncho() {
        return ancho;
    }

    public void setAncho(Integer ancho) {
        this.ancho = ancho;
    }

    public Integer getAlto() {
        return alto;
    }

    public void setAlto(Integer alto) {
        this.alto = alto;
    }

    public Integer getLargo() {
        return largo;
    }

    public void setLargo(Integer largo) {
        this.largo = largo;
    }

    public Integer getSuperficie() {
        return superficie;
    }

    public void setSuperficie(Integer superficie) {
        this.superficie = superficie;
    }

    public Integer getVolumen() {
        return volumen;
    }

    public void setVolumen(Integer volumen) {
        this.volumen = volumen;
    }

    @Override
    public String toString() {
        return " superficie=" + superficie + ", volumen=" + volumen + '}';
    }
   
}
