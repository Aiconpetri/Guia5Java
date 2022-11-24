package Servicios;

import EntidadesNietas.Residencia;
import java.util.ArrayList;

public class ServicioResidencia {

    public void mostrarLista(ArrayList<Residencia> r) {
        for (Residencia aux : r) {
            System.out.println(aux);
                    System.out.println(" ");
        }
    }

    public void mostrarListaDescuento(ArrayList<Residencia> r) {
        for (Residencia aux : r) {
            if (aux.getDescuento().equalsIgnoreCase("SI")) {
                System.out.println(aux);  
            }
            System.out.println(" ");
        }
    }
}
