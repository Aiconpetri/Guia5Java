
package Servicios;

import EntidadPadre.Electrodomestico;
import EntidadesHijas.Televisor;
import java.util.ArrayList;
import java.util.Scanner;

public class ServicioTelevisor extends ServicioElectrodomestico {
     Scanner read=new Scanner(System.in).useDelimiter("\n");
     ArrayList <Televisor> televisores=new ArrayList<>();
    public Televisor crearTelevisor(){
        Televisor t=new Televisor();
        super.crerElectrodomestico(t);
        System.out.println("Ingrese las pulgadas del tele");
        t.setPulgadas(read.nextInt());
        System.out.println("¿Desea que tenga sincronizador de TDT?(S/N");
        String des=read.next();
        if(des.equalsIgnoreCase("S")){
            t.setTDT(true);
        }else{
            t.setTDT(false);
        }
        televisores.add(t);
        return t;
    }
     @Override
    public void precioFinal(Electrodomestico t){
        super.precioFinal(t);
        if(televisores.get(0).isTDT()){
            t.setPrecio(t.getPrecio()+500);
        }
        if(televisores.get(0).getPulgadas()>40){
            t.setPrecio(t.getPrecio()*1.3);
        }
        System.out.println("Su televisor costara $"+t.getPrecio());
    }
}
