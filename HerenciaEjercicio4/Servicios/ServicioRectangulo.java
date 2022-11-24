
package Servicios;
import Entidades.Rectangulo;
import Interfaces.calculosFormas;
import java.util.ArrayList;
import java.util.Scanner;
public class ServicioRectangulo implements calculosFormas {
     Scanner read=new Scanner(System.in).useDelimiter("\n");
     ArrayList<Rectangulo> rectangulos=new ArrayList<>();
    @Override
    public void crearFigura() {
        Rectangulo r=new Rectangulo();
        System.out.println("Ingrese la base del rectangulo");
        r.setBase(read.nextDouble());
        System.out.println("Ingrese la altura del rectangulo");
        r.setAltura(read.nextDouble());
        rectangulos.add(r);
        r.setArea(calcularArea());
        r.setPerimetro(calcularPerimetro());
    }

    @Override
    public Double calcularArea() {
        Double a=rectangulos.get(0).getBase()*rectangulos.get(0).getAltura();
        return a;
    }

    @Override
    public Double calcularPerimetro() {
        Double p=(rectangulos.get(0).getBase()+rectangulos.get(0).getAltura())*2;
        return p;
    }

    @Override
    public void mostrarFormas() {
        System.out.println("Se muestra el rectangulo");
        System.out.println(rectangulos.get(0));
    }
    
}
