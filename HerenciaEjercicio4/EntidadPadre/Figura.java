
package EntidadPadre;

public class Figura {
    protected Double perimetro;
    protected Double area;

    public Figura() {
    }

    public Figura(Double perimetro, Double area) {
        this.perimetro = perimetro;
        this.area = area;
    }

    public Double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(Double perimetro) {
        this.perimetro = perimetro;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "perimetro=" + perimetro + ", area=" + area + '}';
    }
    
}
