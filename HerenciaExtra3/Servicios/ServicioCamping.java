
package Servicios;

import EntidadesNietas.Camping;
import java.util.ArrayList;

public class ServicioCamping {
   public void mostrarLista(ArrayList<Camping> c){
      for (Camping aux:c){
          System.out.println(aux);
          System.out.println(" ");
      }
   }
  public void mostrarListaResto(ArrayList<Camping> c){
      for (Camping aux:c){
          if(aux.getRestaurant().equalsIgnoreCase("SI")){
              System.out.println(aux);
          }
          System.out.println(" ");
      }
   }
}
