
package EntidadesHijas;

import EntidadPadre.Edificio;

public final class Polideportivo extends Edificio {
     private String nombre;
    private boolean techo;

    public Polideportivo() {
    }

    public Polideportivo(String nombre, boolean techo, Integer ancho, Integer alto, Integer largo, Integer superficie, Integer volumen) {
        super(ancho, alto, largo, superficie, volumen);
        this.nombre = nombre;
        this.techo = techo;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isTecho() {
        return techo;
    }

    public void setTecho(boolean techo) {
        this.techo = techo;
    }

    @Override
    public String toString() {
        return "Oficinas{" + "nombre=" + nombre + ", techo=" + techo + super.toString()+ '}';
    } 
}
