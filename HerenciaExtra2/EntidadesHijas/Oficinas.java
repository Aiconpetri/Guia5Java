
package EntidadesHijas;

import EntidadPadre.Edificio;

public final class Oficinas extends Edificio{
   private Integer nOficinas;
   private Integer nPersonas;
   private Integer nPisos;

    public Oficinas() {
    }

    public Oficinas(Integer nOficinas, Integer nPersonas, Integer nPisos, Integer ancho, Integer alto, Integer largo, Integer superficie, Integer volumen) {
        super(ancho, alto, largo, superficie, volumen);
        this.nOficinas = nOficinas;
        this.nPersonas = nPersonas;
        this.nPisos = nPisos;
    }

    public Integer getnOficinas() {
        return nOficinas;
    }

    public void setnOficinas(Integer nOficinas) {
        this.nOficinas = nOficinas;
    }

    public Integer getnPersonas() {
        return nPersonas;
    }

    public void setnPersonas(Integer nPersonas) {
        this.nPersonas = nPersonas;
    }

    public Integer getnPisos() {
        return nPisos;
    }

    public void setnPisos(Integer nPisos) {
        this.nPisos = nPisos;
    }

    @Override
    public String toString() {
        return "Oficinas{" + "nOficinas=" + nOficinas + ", nPersonas=" + nPersonas + ", nPisos=" + nPisos + '}';
    }
   
}
