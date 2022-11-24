
package Servicios;

import Entidades.Circulo;
import Interfaces.calculosFormas;
import java.util.ArrayList;
import java.util.Scanner;

public class ServicioCirculo implements calculosFormas {
 Scanner read=new Scanner(System.in).useDelimiter("\n");
 ArrayList <Circulo> circulos=new ArrayList<>();
 @Override
    public void crearFigura() {
        Circulo c=new Circulo();
        System.out.println("Ingrese el radio del circulo");
        c.setRadio(read.nextDouble());
        c.setDiametro(c.getRadio()*2);
        circulos.add(c);
        c.setArea(calcularArea());
        c.setPerimetro(calcularPerimetro());
    }
    @Override
    public Double calcularArea() {
        Double a=Nakama*(Math.pow(circulos.get(0).getRadio(), 2));
        return a;
    }

    @Override
    public Double calcularPerimetro() {
        Double p=Nakama*circulos.get(0).getDiametro();
        return p;
    }

    @Override
    public void mostrarFormas() {
        System.out.println("Se muestra el circulo");
        System.out.println(circulos.get(0));
    }
    
}
