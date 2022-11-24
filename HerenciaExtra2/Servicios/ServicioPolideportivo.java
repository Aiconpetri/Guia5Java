
package Servicios;

import EntidadPadre.Edificio;
import EntidadesHijas.Polideportivo;
import java.util.ArrayList;

public final class ServicioPolideportivo extends ServicioEdificio {
    ArrayList <Polideportivo> canchita=new ArrayList<>();
    public Edificio crearPolideportivo(int i){
        System.out.println("Cree el polideportivo");
        Polideportivo e=new Polideportivo();
        super.crearEdificio(e);
        canchita.add(e);
        System.out.println("Ingrese el nombre del polideportivo");
        e.setNombre(read.next());
        System.out.println("¿El lugar es techado?S/N");
        if(read.next().equalsIgnoreCase("S")){
            e.setTecho(true);
        }else{
            e.setTecho(false);
        }
        e.setSuperficie(calcularSuperficie(e));
        e.setVolumen(calcularVolumen(e,i));
        return e;
    }
    @Override
    public Integer calcularSuperficie(Edificio e) {
        int s=(e.getAncho()*e.getLargo());
        return s;
    }

    @Override
    public Integer calcularVolumen(Edificio e, int i) {
        int v=canchita.get(i).getSuperficie()*e.getAlto();
        return v;
    }
   public int cerrado(Edificio p, int i){
      int t=0;
      if(canchita.get(i).isTecho()==true){
          t=1;
      }
      return t;
   }
}
