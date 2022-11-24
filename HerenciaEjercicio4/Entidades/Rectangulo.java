
package Entidades;

import EntidadPadre.Figura;


public final class Rectangulo extends Figura {
    
    private Double altura;
    private Double base;

    public Rectangulo() {
    }
    public Rectangulo(Double altura, Double base, Double perimetro, Double area) {
        super(perimetro, area);
        this.altura = altura;
        this.base = base;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    @Override
    public String toString() {
        return "Rectangulo{" + "altura=" + altura + ", base=" + base +" "+ super.toString()+ '}';
    }

   
}
