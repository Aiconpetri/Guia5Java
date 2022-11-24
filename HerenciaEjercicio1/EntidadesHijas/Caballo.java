
package EntidadesHijas;

import EntidadPadre.Animal;

public final class Caballo extends Animal {

    public Caballo() {
    }

    public Caballo(String nombre, String alimento, Integer edad, String raza) {
        super(nombre, alimento, edad, raza);
    }
    @Override
    public void alimentarse() {
        System.out.println("El caballo "+super.nombre+" come heno");
    }
    
}
