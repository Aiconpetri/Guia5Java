
package Servicios;

import EntidadPadre.Edificio;
import java.util.Scanner;

public abstract class ServicioEdificio {
    Scanner read=new Scanner(System.in).useDelimiter("\n");
    public abstract Integer calcularSuperficie(Edificio e);
    public abstract Integer calcularVolumen(Edificio e,int i);
    public void crearEdificio(Edificio e){
        System.out.println("Ingrese la altura");
        e.setAlto(read.nextInt());
        System.out.println("Ingrese el ancho");
        e.setAncho(read.nextInt());
        System.out.println("Ingrese el largo");
        e.setLargo(read.nextInt());
    }
}
