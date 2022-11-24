
package Main;

import EntidadPadre.Edificio;
import Servicios.ServicioOficina;
import Servicios.ServicioPolideportivo;
import java.util.ArrayList;

public class BobConstruye {
    public static void main(String[] args) {
      ArrayList<Edificio> edificios=new ArrayList<>();
      ServicioPolideportivo sp=new ServicioPolideportivo();
      ServicioOficina so=new ServicioOficina();
      int cont=0;
      int abierto=2;
        for (int i = 0; i < 4; i++) {
            if(i<2){
                edificios.add(sp.crearPolideportivo(cont));
            }else{
                edificios.add(so.crearOficina(cont));
            }
            cont++;
            if(cont==2){
                cont=0;
            }
        }
        cont=0;
        for (int i = 0; i < edificios.size(); i++) {
            if(i<2){
                abierto=-(sp.cerrado(edificios.get(i), cont));
            }else{
                so.cantidadPersonas(edificios.get(i),cont);
            }
            cont++;
             if(cont==2){
                cont=0;
            }  
        }
         System.out.println("Los polideportivos abiertos son "+abierto+" y los polideportivos cerrados son "+(2-abierto));
    }
}
