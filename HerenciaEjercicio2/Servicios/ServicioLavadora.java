
package Servicios;

import EntidadPadre.Electrodomestico;
import EntidadesHijas.Lavadora;
import java.util.ArrayList;
import java.util.Scanner;

public final class ServicioLavadora extends ServicioElectrodomestico {
    Scanner read=new Scanner(System.in).useDelimiter("\n");
    ArrayList <Lavadora> lavadoras=new ArrayList<>();
    public Lavadora crearLavadora(){
        Lavadora l=new Lavadora();
        super.crerElectrodomestico(l);
        System.out.println("Ingrese la carga de la lavadora");
        l.setCarga(read.nextInt());
        lavadoras.add(l);
        return l;
    }
    @Override
    public void precioFinal(Electrodomestico l){
        super.precioFinal(l);
        if(lavadoras.get(0).getCarga()>30){
            l.setPrecio(l.getPrecio()+500);
        }
        System.out.println("Su lavadora costara $"+l.getPrecio());
    }
}
