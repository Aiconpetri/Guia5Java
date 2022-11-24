
package EntidadesHijas;

import EntidadPadre.Animal;

public final class Gato extends Animal {

    public Gato() {
    }

    public Gato(String nombre, String alimento, Integer edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    @Override
    public void alimentarse() {
        System.out.println("El gato "+super.nombre+" come pescado");
    }
    
}
