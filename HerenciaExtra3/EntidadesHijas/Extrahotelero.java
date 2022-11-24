
package EntidadesHijas;

import EntidadPadre.Alojamiento;

public class Extrahotelero extends Alojamiento {
    protected String privado;
    protected Integer metros;

    public Extrahotelero() {
    }
    public Extrahotelero(String privado, Integer metros, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.privado = privado;
        this.metros = metros;
    }

    @Override
    public String toString() {
        return ""+super.toString()+"\n"+
                "Complejo privado=" + privado + ", Amplitud=" + metros +"m2"+ '}';
    }
    
}
