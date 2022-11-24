
package Servicios;

import EntidadPadre.Edificio;
import EntidadesHijas.Oficinas;
import java.util.ArrayList;

public final class ServicioOficina extends ServicioEdificio {
    ArrayList <Oficinas> oficinitas=new ArrayList();
    public Oficinas crearOficina(int i){
        System.out.println("Cree el edificio de oficinas");
        Oficinas e=new Oficinas();
        super.crearEdificio(e);
        oficinitas.add(e);
        System.out.println("Ingrese la cantidad de pisos que tiene el edificio");
        e.setnPisos(read.nextInt());
        e.setnOficinas(e.getnPisos());
        System.out.println("Ingrese la cantidad de personas que entran por oficina");
        e.setnPersonas(read.nextInt());
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
        int v=oficinitas.get(i).getSuperficie()*e.getAlto();
        return v;
    }
    public void cantidadPersonas(Edificio e, int i){
        System.out.println("En cada piso entran "+oficinitas.get(i).getnPersonas()+" personas");
        System.out.println("En todo el edificio entran "+(oficinitas.get(i).getnPersonas()*oficinitas.get(i).getnPisos())+" personas");
    }
}
