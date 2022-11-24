
package Main;
import Servicios.ServicioLavadora;
import Servicios.ServicioTelevisor;

public class Fraverga {

    public static void main(String[] args) {
        System.out.println("Introduzca los datos de su lavadora");
        ServicioLavadora sl= new ServicioLavadora();
        sl.precioFinal(sl.crearLavadora());
        System.out.println("Introduzca los datos de su televisor");
        ServicioTelevisor st=new ServicioTelevisor();
        st.precioFinal(st.crearTelevisor());
    }   
}
