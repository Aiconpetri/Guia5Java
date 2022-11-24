
package Main;

import Servicios.ServicioCirculo;
import Servicios.ServicioRectangulo;

public class Formas {

    public static void main(String[] args) {
        ServicioCirculo sc= new ServicioCirculo();
        ServicioRectangulo sr=new ServicioRectangulo();
        System.out.println("Cree un circulo");
        sc.crearFigura();
        System.out.println("Cree un rectangulo");
        sr.crearFigura();
        sc.mostrarFormas();
        sr.mostrarFormas();
    }   
}
