
package Entidades;

import EntidadPadre.Figura;
import java.util.Scanner;

public final class Circulo extends Figura{
    Scanner read=new Scanner(System.in).useDelimiter("n");
    private Double radio;
    private Double diametro;

    public Circulo() {
    }

    public Circulo(Double radio, Double diametro, Double perimetro, Double area) {
        super(perimetro, area);
        this.radio = radio;
        this.diametro = diametro;
    }

    public Double getRadio() {
        return radio;
    }

    public Double getDiametro() {
        return diametro;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }

    public void setDiametro(Double diametro) {
        this.diametro = diametro;
    }

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + ", diametro=" + diametro +" "+ super.toString()+ '}';
    }
}
